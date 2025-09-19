import java.util.Scanner;

public class Farenheint{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Temperatura em Celsius: ");
        double temperatura = input.nextDouble();

        System.out.println(calculadora(temperatura)+"F");
    }

    public static double calculadora(double temperatura){
        return (temperatura*(9.0/5.0))+32;
    }
}