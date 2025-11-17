package br.bemestaranimal.modelo;
public class Animal {
    private String nome;
    private int idade;
    private AnimalTipo tipo;
    private Tutor tutor;
    public Animal(String nome,int idade,AnimalTipo tipo,Tutor tutor){
        this.nome=nome; this.idade=idade; this.tipo=tipo; this.tutor=tutor;
    }
    public String getNome(){return nome;}
    public int getIdade(){return idade;}
    public AnimalTipo getTipo(){return tipo;}
    public Tutor getTutor(){return tutor;}
    public void setNome(String nome){this.nome=nome;}
    public void setIdade(int idade){this.idade=idade;}
    public String toString(){
        return "Animal: "+nome+" | Idade: "+idade+" | Tipo: "+tipo+" | Tutor: "+tutor.getNome();
    }
}