import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        OrganizadorDeMusica orgMus = new OrganizadorDeMusica();
        Menu mainMenu = new Menu();
        int opcao = 0;
        boolean quit = true;

        // MENU
        do{
            mainMenu.limpaTela();
            mainMenu.menuPrincipal();
            opcao = input.nextInt();
            input.nextLine();
            switch(opcao){
                case 1:
                    mainMenu.limpaTela();
                    System.out.print("Titulo: ");
                    String titulo = input.nextLine();
                    System.out.print("Artista: ");
                    String artista = input.nextLine();
                    System.out.print("Duracao: ");
                    double duracao = input.nextDouble();
                    orgMus.adicionarFaixa(titulo, artista, duracao);
                    break;

                case 2:
                    mainMenu.limpaTela();
                    System.out.print("Remover numero: ");
                    int index = input.nextInt();
                    orgMus.removerFaixa(index);
                    break;

                case 3:
                    mainMenu.limpaTela();
                    System.out.print("Repoduzir numero: ");
                    int numero = input.nextInt();
                    orgMus.reproduzirFaixa(numero);
                    input.nextInt();
                    break;

                case 4:
                    mainMenu.limpaTela();
                    orgMus.listarTodasAsFaixas();
                    input.nextInt();
                    break; 
                    
                case 5:
                    quit = false;  
            }
        }while(quit == true);
    }
}