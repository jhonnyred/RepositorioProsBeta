public class Pocao{
    // ATRIBUTOS
    String nome;
    int poder;
    String tipo;

    // CONSTRUTORES
    Pocao(){}

    Pocao(String nome){
        this.nome = nome;
    }

    Pocao(String nome, int poder){
        this.nome = nome;
        this.poder = poder;
    }

    Pocao(String nome, int poder, String tipo){
        this.nome = nome;
        this.poder = poder;
        this.tipo = tipo;
    }

    // MÉTODOS
    public void usar(){
        System.out.println("A pocao " +this.nome+ " foi usada!"+
        "\nEla causou " +this.poder+ "de dano");
    }

    public void usar(String alvo){
    System.out.println("A pocao " +this.nome+ " foi usada em "+ alvo+
    "!\nEla causou " +this.poder+ "de dano");
    }

    public void usar(String alvo, int vezes){
        System.out.println("A pocao " +this.nome+ " foi usada " +vezes+ " em "+ alvo+
        "!\nEla causou " +this.poder+ "de dano");
    }

    public void ver(){
        String fodase;
        if(this.tipo == null){
            fodase = "nao tem tipo";
        }else{
            fodase = this.tipo;
        }
        System.out.println("Nome: " +this.nome+
                        "\nPoder: " +this.poder+
                        "\nTipo: " + fodase);
    }

    // SETTERS
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setPoder(int Poder){
        this.poder = poder;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
}