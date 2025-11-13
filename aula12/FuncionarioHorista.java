public class FuncionarioHorista extends Funcionario{
    // ATRIBUTOS
    private int qtdHoras;
    private double valorHora;

    // CONSTRUTOR
    public FuncionarioHorista(){}
    
    public FuncionarioHorista(int numeroCracha, String nome, String setor, String funcao, int qtdHoras, double valorHora){
        super(numeroCracha, nome, setor, funcao);
        this.qtdHoras = qtdHoras;
        this.valorHora = valorHora;
    }

    // MÉTODOS
    @Override
    public double calcularSalario(){
        return this.qtdHoras*this.valorHora;
    }

    public String toString(){
        return "\nNome: " +getNome()+ 
               "\nSetor: " +getSetor()+
               "\nFuncao: " +getFuncao()+
               "\nSalario:" +calcularSalario();
    }

    // GETTERS
    public int getQtdHoras(){
        return this.qtdHoras;
    }

    public double getValorHora(){
        return this.valorHora;
    }

    // SETTERS
    public void setQtdHoras(int qtdHoras){
        this.qtdHoras = qtdHoras;
    }
    
    public void setValorHora(int valorHora){
        this.valorHora = valorHora;
    }
}