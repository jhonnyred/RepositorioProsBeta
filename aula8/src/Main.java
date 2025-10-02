import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Funcionario> funcList = new ArrayList<Funcionario>();
        int option = 0;
        boolean quit = true;
        do{
            for(int i=0; i<10000; i++){
                System.out.println();
            }
            System.out.println("1 - cadastrar funcionario\n"+
                               "2 - mostrar todos os funcionarios\n"+
                               "3 - procurar funcionario\n"+
                               "4 - sair");
            option = input.nextInt();

            switch(option){
                
                // cadastrar funcionario
                case 1:
                    for(int i=0; i<10000; i++){
                        System.out.println();
                    }
                    System.out.print("Codigo: ");
                    int codigo = input.nextInt();

                    System.out.print("Nome: ");
                    String nome = input.nextLine();
                    input.nextLine();
                    
                    System.out.print("Setor: ");
                    String setor = input.nextLine();

                    System.out.print("Funcao: ");
                    String funcao = input.nextLine();

                    System.out.print("Salario: ");
                    double salario = input.nextDouble();
                    
                    Funcionario func = new Funcionario(codigo, nome, setor, 
                                                       funcao, salario);
                    funcList.add(func);
                    break;
                
                // mostrar todos os funcioanarios
                case 2:
                    for(int i=0; i<10000; i++){
                        System.out.println();
                    }
                    for(Funcionario f : funcList){
                        f.imprimir();
                    }
                    input.nextInt();
                    break;

                // mostrar funcionário
                case 3:
                    for(int i=0; i<10000; i++){
                        System.out.println();
                    }

                    System.out.print("Codigo: ");
                    int codigoFind = input.nextInt();

                    for(Funcionario f : funcList){
                        if (f.getCodigo() == codigoFind){
                            f.imprimir();
                        }    
                    }
                    input.nextInt();
                    break;
                case 4:
                    quit = false;
                    break;
            }
        }while(quit);
    }
}