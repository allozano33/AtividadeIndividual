package com.company.company.Exercicio1;

import com.company.Exercicio1.Agenda;

import java.util.ArrayList;
import java.util.List;

public class Main extends Agenda {

    public static void main (String[] args) {

        Agenda agenda = new Agenda();

        List<Pessoa> pessoa = new ArrayList<Pessoa>();
        pessoa.add(new Pessoa("Pedro", "Av do Cursino, 6787", "11-2323-42-22", 90, 1.94));
        pessoa.add(new Pessoa("Mario", "Rua Japão, 21", "11-4343-43-34", 20, 2.02));
        pessoa.add(new Pessoa("Paulo", "Rua Republica Siria, 234", "11-5781-23-33", 85, 1.90));
        pessoa.add(new Pessoa("Godofredo","Rua Miguel Stefano, 123", "11-4454-12-32", 20, 1.70));
        pessoa.add(new Pessoa("Catarina", "Rua Curio, 21", "11-3232-11-21", 21, 1.90));
        pessoa.add(new Pessoa("Manoela", "Rua Zoologico, 323", "21-2212-22-12", 23, 1.98));
        pessoa.add(new Pessoa("Stella", "Rua dos Ourives, 89", "13-3212-23-32", 79, 1.75));
        pessoa.add(new Pessoa("Alessandro", "Rua Capitu, 323", "11-2323-23-22", 47, 1.89));
        pessoa.add(new Pessoa("Eveline", "Rua Eugenia Vitalle, 321", "11-2323-32-22", 40, 1.55));
        pessoa.add(new Pessoa("Miagi", "Rua Capitao Vermelho, 323", "11-3234-43-44", 2, 1.42));

        for (Pessoa listaPessoa : pessoa) { agenda.armazenarPessoa(listaPessoa);
        }
        System.out.println ("\nLista de Nomes\n");

        agenda.exibirTodaAgenda();
        System.out.println("\nIncluindo Marcia\n");

        agenda.armazenarPessoa(new Pessoa("Marcia", "Rua Luz, 232", "11-3233-11-99", 19, 1.99));
        agenda.exibirTodaAgenda();
        System.out.println("\nRetirando Miagi \n");
        agenda.removerPessoa("Miagi");

        agenda.exibirTodaAgenda();
        System.out.println("\nBuscando Stella e retornando sua posição\n");
        System.out.println("Posição  ===> " + agenda.buscarPessoa("Stella"));

        System.out.println("\nBusca a pessoa na posição 5 e Exibe \n");
        agenda.exibirPessoa(5);

        System.out.println("\nLista por ordem alfabética\n");
        agenda.listarPessoasEmOrdemAlfabéticaDeNome();

        System.out.println("\nLista por endereço em ordem alfabética\n");
        agenda.listarPessoasEmOrdemAlfabeticaDeEndereco();

        System.out.println("\nLista por idade em ordem decrescente\n");
        agenda.listarPessoasPorIdade();

    }
}

