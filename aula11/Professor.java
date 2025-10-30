public class Professor extends Pessoa{
    // ATRIBUTOS
    String cracha;
    char tipoVinculo;
    double salario;
    
    // CONSTRUTOR
    public Professor(){}

    public Professor(String nome, String cpf, String cracha){
        super(nome, cpf);
        this.cracha = cracha;
    }

    public Professor(String nome, String cpf, String cracha, char tipoVinculo, double salario){
        super(nome, cpf);
        this.cracha = cracha;
        this.tipoVinculo = tipoVinculo;
        this.salario = salario;
    }

    // MÉTODOS
    public String imprimir(){
        String msg = "\n## PROFESSOR ##"
                    +"\nNome: " + getNome()
                    +"\nCPF: " + getCpf()
                    +"\nCracha: " + cracha
                    +"\nVinculo: " + tipoVinculo
                    +"\nSalario: " + salario;
        return msg;
    }

    // GETTERS
    // SETTERS
}
