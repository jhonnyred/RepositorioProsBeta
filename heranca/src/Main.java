import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Animal> animaisList = new ArrayList<Animal>();
        Menu menu = new Menu();
        int opcao = 0;
        boolean quit = true;
        String[] menuPrincipal = {
                                  "Cadastrar", 
                                  "Mostrar todos (imprimir)",
                                  "Animal falando"
                                };
        String[] menuCadastrar = {
                                  "CACHORRO",
                                  "GATO",
                                  "CAPIVARA"
                                };

        // MENU PRINCIPAL
        do{
            menu.limpaTela();
            menu.imprimirMenu(menuPrincipal);
            opcao = input.nextInt();
            input.nextLine();
            switch(opcao){
                case 1:
                    menu.limpaTela();

                    // MENU CADASTRAR
                    menu.imprimirMenu(menuCadastrar);
                    opcao = input.nextInt();
                    input.nextLine();
                    switch(opcao){
                        case 1:{
                            menu.limpaTela();
                            System.out.print("Nome: ");
                            String nome = input.nextLine();
                            System.out.print("Idade:");
                            int idade = input.nextInt();
                            input.nextLine();
                            Cachorro dog = new Cachorro(nome, idade, 120);
                            animaisList.add(dog);
                            menu.limpaTela();
                            System.out.println(dog.imprimir());
                            System.out.print("\n pressione ENTER para continuar");
                            input.nextLine();
                            break;
                        }
                        case 2:{
                            menu.limpaTela();
                            System.out.print("Nome: ");
                            String nome = input.nextLine();
                            System.out.print("Idade:");
                            int idade = input.nextInt();
                            input.nextLine();
                            Gato cat = new Gato(nome, idade, 3);
                            animaisList.add(cat);
                            menu.limpaTela();
                            System.out.println(cat.imprimir());
                            System.out.print("\n pressione ENTER para continuar");
                            input.nextLine();
                            break;
                        }
                        case 3:{
                            menu.limpaTela();
                            System.out.print("Nome: ");
                            String nome = input.nextLine();
                            System.out.print("Idade:");
                            int idade = input.nextInt();
                            input.nextLine();
                            Capivara capybara = new Capivara(nome, idade, 45);
                            animaisList.add(capybara);
                            menu.limpaTela();
                            System.out.println(capybara.imprimir());
                            System.out.print("\n pressione ENTER para continuar");
                            input.nextLine();
                            break;
                        }
                    }
                    break;
                case 2:
                    menu.limpaTela();
                    for(Animal a : animaisList){
                        System.out.println();
                        System.out.println(a.imprimir());
                    }
                    System.out.print("\n pressione ENTER para continuar");
                    input.nextLine();
                    break;
                case 3:
                    menu.limpaTela();
                    for(Animal a : animaisList){
                        System.out.println();
                        System.out.println(a.falar());
                    }
                    System.out.print("\n pressione ENTER para continuar");
                    input.nextLine();
                break;
                case 4:
                    quit = false;
                break;
            }
        }while(quit == true);
    }
}