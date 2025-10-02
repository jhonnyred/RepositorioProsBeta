public class Funcionario{
    private int codigo;
    private String nome;
    private String setor;
    private String funcao;
    private double salario;

    // CONSTRUTORES
    Funcionario(){}

    Funcionario(int codigo, String nome, String setor, 
                String funcao, double salario){
        this.codigo = codigo;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
        this.salario = salario;
    }

    // MÉTODOS
    public void imprimir(){
        System.out.println("Codigo: " +this.codigo+
                           "Nome: " +this.nome+
                           "Setor: " +this.setor+
                           "Funcao: " +this.funcao+
                           "Salario: " +this.salario);
    }

    // GETTERS
    public int getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public String getSetor(){
        return this.setor;
    }

    public String getFuncao(){
        return this.funcao;
    }

    public double getSalario(){
        return this.salario;
    }

    // SETTERS
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSetor(String funcao){
        this.funcao = funcao;
    }

    public void setFuncao(String funcao){
        this.funcao = funcao;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}