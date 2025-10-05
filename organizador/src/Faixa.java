public class Faixa{
    // ATRIBUTOS
    private String titulo;
    private String artista;
    private double duracao;

    // CONSTRUTORES
    public Faixa(String titulo, String artista, double duracao){
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    // MÉTODOS
    public void print(){
        System.out.println("Titulo: " +this.titulo+
                           "\nArtista: " +this.artista+
                            "\nDuracao: " +this.duracao);
    }

    public void reproduzir(){
        System.out.println("reproduzindo");
    }


    // GETTERS
    public String getTitulo(){
        return this.titulo;
    }

    public String getArtista(){
        return this.artista;
    }

    public double getDuracao(){
        return this.duracao;
    }

    // SETTERS
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setArtista(String artista){
        this.artista = artista;
    }

    public void setTitulo(double duracao){
        this.duracao = duracao;
    }
}