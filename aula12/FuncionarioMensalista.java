public class FuncionarioMensalista extends Funcionario{
    // ATRIBUTOS
    private double salario;
    private double desconto;

    // CONSTRUTOR
    public FuncionarioMensalista(){}

    public FuncionarioMensalista(int numeroCracha, String nome, String setor, String funcao, double salario, double desconto){
        super(numeroCracha, nome, setor, funcao);
        this.salario = salario;
        this.desconto = desconto;                
    }

    // MÉTODOS
    @Override
    public double calcularSalario(){
        return this.salario - this.desconto;
    }

    public String toString(){
        return "\nNome: " +getNome()+ 
               "\nSetor: " +getSetor()+
               "\nFuncao: " +getFuncao()+
               "\nSalario:" +calcularSalario();
    }


    // GETTERS
    public double getSalario(){
        return this.salario;
    }

    public double getDesconto(){
        return this.desconto;
    }

    // SETTERS
    public void setSalario(double salario){
        this.salario = salario;  
    }

    public void setDesconto(double desconto){
        this.desconto = desconto;  
    }
}
