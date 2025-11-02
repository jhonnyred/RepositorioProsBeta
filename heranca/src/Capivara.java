public class Capivara extends Animal{
    // ATRIBUTOS
    private int peso;

    // CONSTRUTORES
    public Capivara(){}

    public Capivara(String nome, int idade, int peso){
        super(nome, idade);
        this.peso = peso;
    }

    // MÉETODOS
    @Override
    public String imprimir(){
        String msg = "\n## CAPIVARA ##"
                    +"\nNome: " +getNome()
                    +"\nIdade: " +getIdade()
                    +"\nPeso: " +this.peso+ "Kg";
        return msg;
    }

    @Override
    public String falar(){
        String msg = "Roinc Roinc sou uma capivara";
        return msg; 
    }

    // GETTERS
    public int getPeso(){
        return this.peso;
    }

    // SETTERS
    public void setPeso(int peso){
        this.peso = peso;
    }
}
