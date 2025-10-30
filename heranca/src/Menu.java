import java.util.ArrayList;

public class Menu{
    ArrayList<String> opcoes = new ArrayList<String>(); 

    // CONSTRUTOR
    public Menu(){}

    //  MÉTODOS
    public void limpaTela(){
        for(int i=0; i<100; i++){
            System.out.println();
        }
    }

    public void imprimirMenu(String[] opcoes){
        for(int i=0; i < opcoes.length; i++){
            System.out.println("\n"+(i+1)+" - "+opcoes[i]);

            if((i+1)==opcoes.length){
                System.out.println("\n"+(i+1)+" - Sair");
            }
        }

    }
}