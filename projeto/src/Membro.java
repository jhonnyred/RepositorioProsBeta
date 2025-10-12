public class Membro{
    // ATRIBUTOS
    private String nome;
    private String cargo;

    // CONSTRUTOR
    public Membro(String nome, String cargo){
        this.nome = nome;
        this.cargo = cargo;
    }

    // MÉTODOS
    public String print(){
        return "Nome: " +this.nome+ "\nCargo: " +this.cargo;
    }

    // GETTERS
    public String getNome(){
        return this.nome;
    }

    public String getCargo(){
        return this.cargo;
    }

    // SETTERS
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }
}