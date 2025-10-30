public class Pessoa{
    // ATRIBUTOS
    private String nome;
    private String cpf;

    // CONSTRUTOR
    public Pessoa(){}

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    // MÉTODOS
    public String imprimir(){
        String msg = "\n## PESSOA ##"
                +"\nNome: " +nome
                +"\nCPF: " +cpf; 
        return msg;
    }
    // GETTERS
    public String getNome(){
        return this.nome;
    }

    public String getCpf(){
        return this.cpf;
    }

    // SETTERS
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
} 