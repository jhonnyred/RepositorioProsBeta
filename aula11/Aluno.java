public class Aluno extends Pessoa{
    // ATRIBUTOS
    private String ra;
    private double nota1;
    private double nota2;

    // CONSTRUTOR
    public Aluno(){}

    public Aluno(String nome, String cpf, String ra){
        super(nome, cpf);
        this.ra = ra;
    }

    public Aluno(String nome, String cpf, String ra, double nota1, double nota2){
        super(nome, cpf);
        this.ra = ra;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    // MÉTODOS
    public double media(){
        return (nota1+nota2) / 2; 
    }

    @Override
    public String imprimir(){
        String msg = "\n## ALUNO ##"
                    +"\nNome: " +getNome()
                    +"\n";
        return msg;
    }

    // GETTERS
    public String getRa(){
        return this.ra;
    }

    public double getNota1(){
        return this.nota1;
    }

    public double getNota2(){
        return this.nota2;
    }

    // SETTERS
    public void setRa(String ra){
        this.ra = ra;
    }

    public void setNota1(double nota1){
        this.nota1 = nota1;
    }

    public void setNota2(double nota2){
        this.nota2 = nota2;
    }
}
