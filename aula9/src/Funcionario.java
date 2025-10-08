import java.util.ArrayList;

public class Funcionario{
    // ATRIBUTOS
    private String nome;
    private ArrayList<Funcionario> funcList = new ArrayList<Funcionario>();

    // CONSTRUTOR
    public Funcionario(String nome){
        this.nome = nome;
    }

    // MÉTODOS
    public void addSubordinado(Funcionario func){
        funcList.add(func);
    }

    public void imprimir(){
        System.out.println("Nome: " +this.nome);
    }

    public void imprimirSubordinados(){
        for(Funcionario func : funcList){
            func.imprimir();
        }
    }

    // GETTER
    public String getNome(){
        return this.nome; 
    }

    // SETTER
    public void setNome(String nome){
        this.nome = nome;
    }
}