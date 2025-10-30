public class Animal {
    // ATRIBUTOS
    private String nome;
    private int idade;

    // CONSTRUTOR
    public Animal(){}

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // MÉTODOS
    public String imprimir(){
        String msg = "\n## ANIMAL ##"
                    +"\nNome: " +nome
                    +"\nIdade: " +idade;
        return msg;
    }

    public String falar(){
        String msg = "Emitir som";
        return msg;
    }
    
    // GETTERS
    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    // SETTERS
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
