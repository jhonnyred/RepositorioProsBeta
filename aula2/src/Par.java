import java.util.Scanner;

public class Par{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Numero inteiro: ");
        int numero = input.nextInt();

        System.out.println(verificador(numero));
    }

    public static String verificador(int a){
        if(a%2 == 0){
            return "Parabens esse numero eh par";
        }else{
            return "Parabens vc nao sabe oq eh um numero par";
        }
    }
}