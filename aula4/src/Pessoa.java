class Pessoa{

    // ATRIBUTOS
    private String cpf;
    private String nome;
    private char sexo;
    private int idade;

    // MÉTODOS
    public void  imprimir(){
        cpf  = this.cpf;
        nome = this.nome;
        sexo = this.sexo;
        idade = this.idade;

       System.out.println("cpf: " +cpf+ "\nnome: " +nome+
                           "\nsexo: " +sexo+ "\nidade: " +this.idade); 
    }
    // GETTERS
    public String getCPF(){
        return this.cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public char getSexo(){
        return this.sexo;
    }

    public int getIdade(){
        return this.idade;
    }

    // SETTERS
    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public void setNome(String nome){
        this.nome= nome;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}