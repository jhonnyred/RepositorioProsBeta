import java.util.ArrayList;

public class OrganizadorDeMusica{
    // ATRIBUTOS
    private ArrayList<Faixa> faixas = new ArrayList<Faixa>();

    // CONSTRUTORES
    public OrganizadorDeMusica(){}

    // MÉTODOS
    public void adicionarFaixa(String titulo, String artista, double duracao){
        Faixa f1 = new Faixa(titulo, artista, duracao);
        faixas.add(f1);
    }
 
    public void adicionarFaixa(Faixa faixa){
        faixas.add(faixa);
    }

    public void listarTodasAsFaixas(){
        for(Faixa f: faixas){
            System.out.print("Numero: " + faixas.indexOf(f)+"\n");
            f.print();
        }
    }

    public void reproduzirFaixa(int indice){
        try{
            faixas.get(indice).reproduzir();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Man esse indice nem existe se liga kkkkkkk");
        }
    }

    public void removerFaixa(int indice){
        try{
            faixas.remove(indice).reproduzir();
        }catch(IndexOutOfBoundsException e){
            System.out.println("Man esse indice nem existe se liga kkkkkkk");
        }
    }
}