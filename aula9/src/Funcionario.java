import java.util.ArrayList;

public class Funcionario{
    // ATRIBUTOS
    String nome;
    ArrayList funcList = new Arraylist<Funcionario>();

    // CONSTRUTOR
    public Funcionario(String nome){
        this.nome = nome;
    }

    // MÉTODOS
    public void addFuncionario(Funcionario func){
        funcList.add(func);
    }

    public void imprimir(){
        System.out.println("Nome: " +this.nome);
    }

    public void imprimirSubordinados(){
        for (Funcionario func : funcList){
            func.imprimir();
        }
    }
}