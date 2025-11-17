package br.bemestaranimal.modelo;
public class Consulta {
    private Animal animal;
    private String data;
    private String motivo;
    public Consulta(Animal animal,String data,String motivo){
        this.animal=animal; this.data=data; this.motivo=motivo;
    }
    public Animal getAnimal(){return animal;}
}