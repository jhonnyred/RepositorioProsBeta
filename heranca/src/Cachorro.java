public class Cachorro extends Animal{
    // ATRIBUTOS
    private int velocidade;

    // CONSTRUTORES
    public Cachorro(){}

    public Cachorro(String nome, int idade, int velocidade){
        super(nome, idade);
        this.velocidade = velocidade;
    }

    // MÉTODOS
    @Override
    public String imprimir(){
        String msg = "\n## Cachorro## "
                    +"\nNome: " +getNome()
                    +"\nIdade: " +getIdade()
                    +"\nVelocidade: " +this.velocidade;
        return msg;
    }

    @Override
    public String falar(){
        String msg = "AuAuAu sou um cachorro";
        return msg; 
    }

    // GETTERS
    public int getVelocidade(){
        return this.velocidade;
    }

    // SETTERS
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
}
