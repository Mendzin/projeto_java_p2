package br.bemestaranimal.servico;
import br.bemestaranimal.modelo.*;
import java.util.ArrayList;

public class ServicoSistema {
    private ArrayList<Tutor> tutores=new ArrayList<>();
    private ArrayList<Animal> animais=new ArrayList<>();
    private ArrayList<Consulta> consultas=new ArrayList<>();
    private ArrayList<EstoqueItem> estoque=new ArrayList<>();

    public void cadastrarTutor(String n,String t){ tutores.add(new Tutor(n,t)); }

    public void cadastrarAnimal(String n,int idade,AnimalTipo tipo,String nomeTutor){
        Tutor tutor=buscarTutor(nomeTutor);
        if(tutor!=null){ animais.add(new Animal(n,idade,tipo,tutor)); }
        else System.out.println("Tutor não encontrado!");
    }

    public void marcarConsulta(String nomeAnimal,String data,String motivo){
        Animal a=buscarAnimal(nomeAnimal);
        if(a!=null){
            consultas.add(new Consulta(a,data,motivo));
            System.out.println("\n*** Consulta marcada! ***\n");
        } else System.out.println("Animal não encontrado!");
    }

    public void adicionarItem(String nome,int qtd){
        estoque.add(new EstoqueItem(nome,qtd));
    }

    public void listarEstoque(){
        for(EstoqueItem i:estoque) System.out.println(i);
    }

    public void listarAnimais(){
        for(Animal a:animais) System.out.println(a);
    }

    private Tutor buscarTutor(String n){
        for(Tutor t:tutores) if(t.getNome().equalsIgnoreCase(n)) return t;
        return null;
    }

    private Animal buscarAnimal(String n){
        for(Animal a:animais) if(a.getNome().equalsIgnoreCase(n)) return a;
        return null;
    }
}