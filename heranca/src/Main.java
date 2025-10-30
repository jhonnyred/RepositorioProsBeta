import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        int opcao = 0;
        boolean quit = true;
        String[] menuPrincipal = {"Cadastrar", 
                                  "Mostrar todos (imprimir)",
                                  "Animal falando"
                                };
        String[] menuCadastrar = {"CACHORRO",
                                  "GATO",
                                  "CAPIVARA"
                                };

        // MENU
        do{
            menu.limpaTela();
            menu.imprimirMenu(menuPrincipal);
            opcao = input.nextInt();
            input.nextInt();
            switch(opcao){
                case 1:
                
                break;
                case 2:
                break;
                case 3:
                break;
                case 4:
                    quit = false;
                break;
            }
        }while(quit == true);
    }
}