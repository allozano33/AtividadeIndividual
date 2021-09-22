package com.company.company.Exercicio1;

public class Pessoa {

    String nome;
    String endereco;
    String telefone;
    Integer idade;
    Double altura;


    public Pessoa (String Nome, String Endereco, String Telefone, Integer Idade, Double Altura) {
        this.nome = Nome;
        this.endereco = Endereco;
        this.telefone = Telefone;
        this.idade = Idade;
        this.altura = Altura;
    }




    public String getNome ( ) {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getEndereco ( ) {
        return endereco;
    }

    public void setEndereco (String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone ( ) {
        return telefone;
    }

    public void setTelefone (String telefone) {
        this.telefone = telefone;
    }

    public Integer getIdade ( ) {
        return idade;
    }

    public void setIdade (Integer idade) {
        this.idade = idade;
    }

    public Double getAltura ( ) {
        return altura;
    }

    @Override
    public String toString ( ) {
        return "Pessoa " +
                "Nome= '" + nome + '\'' +
                ", Endereco= '" + endereco + '\'' +
                ", Telefone= '" + telefone + '\'' +
                ", Idade= " + idade +
                ", Altura= " + altura +
                '}';
    }

    public void setAltura (Double altura) {
        this.altura = altura;





    }
}




