import java.util.Scanner;

public class ContaLetra{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Insira a palavra e a letra a ser contada em seguida: ");
        String frase = input.nextLine();
        System.out.print("==> ");
        String letra = input.nextLine();

        System.out.println(contaletra(frase, letra));
    }

    public static int contaletra(String frase, String letra){
        int count = 0;
        
        for(int i=0; i<frase.length(); i++){
            if(frase.toLowerCase().charAt(i) == letra.toLowerCase().charAt(0)){
                count++;
            }else{
                continue;
            }
        }

        return count;
    }
}