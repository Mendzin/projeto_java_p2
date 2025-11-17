package br.bemestaranimal.modelo;
public class EstoqueItem{
    private String nome;
    private int quantidade;
    public EstoqueItem(String nome,int quantidade){
        this.nome=nome; this.quantidade=quantidade;
    }
    public String getNome(){return nome;}
    public int getQuantidade(){return quantidade;}
    public void adicionar(int q){quantidade+=q;}
    public boolean consumir(int q){
        if(quantidade>=q){ quantidade-=q; return true; }
        return false;
    }
    public String toString(){return nome+" - Quantidade: "+quantidade;}
}