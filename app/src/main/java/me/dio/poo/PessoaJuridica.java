package me.dio.poo;

public class PessoaJuridica implements Pessoa{
    private String nome;
    private String id;
    public PessoaJuridica(String nome, String id){
        this.nome = nome;
        this.id = id;
    }
    public String getNome(){return nome;}
    public String getId(){return id;}
}
