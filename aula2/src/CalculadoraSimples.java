import java.util.Scanner;

public class CalculadoraSimples{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        int primeiro = input.nextInt();

        System.out.print("Segundo numero: ");
        int segundo = input.nextInt();
        input.nextLine();        

        System.out.print("Qual operacao: ");
        String operador = input.nextLine();

        System.out.println("Resultado: " + calculadora(primeiro, segundo, operador));
        input.close();
    }

    public static double calculadora(int x, int y, String operador){
        double operacao = 0;
        switch (operador){
            case "+":
                operacao = x + y;
                break;
            case "-":
                operacao = x - y;
                break;
            case "*":
                operacao = x * y;
                break;
            case "/":
                operacao = x / y;
                break;
        }
        
        return operacao;
    }
}