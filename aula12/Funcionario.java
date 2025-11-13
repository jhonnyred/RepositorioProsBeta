abstract class Funcionario{
    // ATRIBUTOS
    private int numeroCracha;
    private String nome;
    private String setor;
    private String funcao;

    // CONSTRUTORES
    public Funcionario(){}

    public Funcionario(int numeroCracha, String nome, String setor, String funcao){
        this.numeroCracha = numeroCracha;
        this.nome = nome;
        this.setor = setor;
        this.funcao = funcao;
    }

    // MÉTODOS
    abstract double calcularSalario();

    // GETTERS
    public int getNumeroCracha(){
        return this.numeroCracha;
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

    // SETTERS
    public void setNumeroCracha(int numeroCracha){
        this.numeroCracha = numeroCracha;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSetor(String setor){
        this.setor = setor;
    }

    public void setFuncao(String funcao){
        this.funcao = funcao;
    }
    
}
