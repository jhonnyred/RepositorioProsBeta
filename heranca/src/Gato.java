public class Gato extends Animal{
    // ATRIBUTOS
    private int alturaSalto;

    // CONSTRUTOR
    public Gato(){}

    public Gato(String nome, int idade, int alturaSalto){
        super(nome, idade);
        this.alturaSalto = alturaSalto;
    }

    // MÉTODOS
    @Override
    public String imprimir() {
        String msg = "\n## GATO ##"
                    +"\nNome: " +getNome()
                    +"\nIdade: " +getIdade()
                    +"\nSalto: " + alturaSalto;
        return msg;
    }

    @Override
    public String falar(){
        String msg = "Miau Miau sou um gato";
        return msg;
    }


    // GETTERS
    public int getAlturaSalto(){
        return this.alturaSalto;
    }

    // SETTERS
    public void setAlturaSalto(int alturaSalto){
        this.alturaSalto = alturaSalto;
    }    
}
