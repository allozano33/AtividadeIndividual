package com.company.company.Exercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Agenda {


    private final List<Pessoa> pessoa = new ArrayList<>();

    public void armazenarPessoa(Pessoa pessoa){ this.pessoa.add(pessoa);
    }

    public void removerPessoa(String nome){ for(int i = 0; i < pessoa.size(); i++){
            Pessoa pessoa = this.pessoa.get(i);
            if(pessoa.getNome().equals(nome)) { this.pessoa.remove(pessoa);

            }
        }
    }

    public int buscarPessoa(String nome){ int posicao = 0;for(int i = 0; i < pessoa.size(); i++){
            Pessoa pessoa = this.pessoa.get(i);
            if(pessoa.getNome().equals(nome)) { posicao = i;
            }
        }
        return posicao;
    }

    public void exibirTodaAgenda(){
        for (Pessoa listaPessoas: pessoa) {
            System.out.println(listaPessoas);
        }
    }
    public void exibirPessoa(int index){
        System.out.println(pessoa.get(index));
    }

    public void listarPessoasEmOrdemAlfabéticaDeNome(){
        List<Pessoa> pessoas = pessoa.stream()
                .sorted((Pessoa pessoa1, Pessoa pessoa2) -> pessoa1.getNome().compareTo(pessoa2.getNome()))
                .collect(Collectors.toList());

        for (Pessoa listaPessoas: pessoas) {
            System.out.println(listaPessoas);
        }
    }

    public void listarPessoasEmOrdemAlfabeticaDeEndereco(){
        List<Pessoa> pessoas = pessoa.stream()
                .sorted((Pessoa pessoa1, Pessoa pessoa2) -> pessoa1.getEndereco().compareTo(pessoa2.getEndereco()))
                .collect(Collectors.toList());

        for (Pessoa listaPessoas: pessoa) {
            System.out.println(listaPessoas);
        }
    }

    public void listarPessoasPorIdade(){
        List<Pessoa> pessoas = pessoa.stream()
                .sorted((Pessoa pessoa1, Pessoa pessoa2) -> pessoa2.getIdade().compareTo(pessoa1.getIdade()))
                .collect(Collectors.toList());

        for (Pessoa listaPessoa: pessoas) {
            System.out.println(listaPessoa);
        }
    }
}
