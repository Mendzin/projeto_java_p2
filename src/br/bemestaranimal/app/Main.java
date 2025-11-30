package br.bemestaranimal.app;
import br.bemestaranimal.servico.ServicoSistema;
import br.bemestaranimal.modelo.AnimalTipo;
import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        ServicoSistema sistema=new ServicoSistema();
        int op;
        do{
            System.out.println("\n=== SISTEMA DE BEM-ESTAR ANIMAL ===");
            System.out.println("1 - Cadastrar Tutor");
            System.out.println("2 - Cadastrar Animal");
            System.out.println("3 - Marcar Consulta");
            System.out.println("4 - Listar Animais");
            System.out.println("5 - Adicionar Item ao Estoque");
            System.out.println("6 - Listar Estoque");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            op=in.nextInt(); in.nextLine();

            switch(op){
                case 1:
                    System.out.print("Nome do tutor: ");
                    String nt=in.nextLine();
                    System.out.print("Telefone: ");
                    String tel=in.nextLine();
                    sistema.cadastrarTutor(nt,tel);
                break;

                case 2:
                    System.out.print("Nome do animal: ");
                    String na=in.nextLine();
                    System.out.print("Idade: ");
                    int idade=in.nextInt(); in.nextLine();
                    System.out.print("Tipo (1=Cachorro,2=Gato,3=Pássaro,4=Outro): ");
                    int t=in.nextInt(); in.nextLine();
                    System.out.print("Nome do tutor: ");
                    String tut=in.nextLine();
                    sistema.cadastrarAnimal(na,idade,AnimalTipo.values()[t-1],tut);
                break;

                case 3:
                    System.out.print("Animal: ");
                    String an=in.nextLine();
                    System.out.print("Data: ");
                    String d=in.nextLine();
                    System.out.print("Motivo: ");
                    String m=in.nextLine();
                    sistema.marcarConsulta(an,d,m);
                break;

                case 4: sistema.listarAnimais(); break;
                case 5:
                    System.out.print("Item: ");
                    String it=in.nextLine();
                    System.out.print("Quantidade: ");
                    int q=in.nextInt();
                    sistema.adicionarItem(it,q);
                break;
                case 6: sistema.listarEstoque(); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida!");
            }
        }while(op!=0);
        in.close();
    }
}