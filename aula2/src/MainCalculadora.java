import java.util.Scanner;

public class MainCalculadora{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        int primeiro = input.nextInt();

        System.out.print("Segundo numero: ");
        int segundo = input.nextInt();


        int soma = soma(primeiro, segundo);
        System.out.println(soma);
    }

    public static int soma(int x, int y){
        int soma = x+y;

        return soma;
    }
}