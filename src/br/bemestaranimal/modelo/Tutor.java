package br.bemestaranimal.modelo;
public class Tutor {
    private String nome;
    private String telefone;
    public Tutor(String nome, String telefone) {
        this.nome = nome; this.telefone = telefone;
    }
    public String getNome(){return nome;}
    public String getTelefone(){return telefone;}
    public void setNome(String nome){this.nome=nome;}
    public void setTelefone(String telefone){this.telefone=telefone;}
    public String toString(){return "Tutor: "+nome+" | Telefone: "+telefone;}
}