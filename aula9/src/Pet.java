class Pet{
    // ATRIBUTOS
    private String nome;
    private String raca;
    private int idade;

    // CONSTRUTOR
    public Pet(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    // MÉTOODOS
    public void imprimir(){
        System.out.println("Nome: " +this.nome+
                          "\nRaca: " +this.raca+
                          "\nIdade: " +this.idade);
    }
}