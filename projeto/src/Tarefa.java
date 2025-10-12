public class Tarefa{
    // ATRIBUTOS
    private String descricao;
    private Membro responsavel;
    private int id;
    private String status;

    // CONSTRUTOR
    public Tarefa(int id, String descricao, Membro reponsavel, String status){
        this.id = id;
        this.descricao = descricao;
        this.responsavel = reponsavel;
        this.status = status;
    }

    // GETTERS
    public String getDescricao(){
        return descricao;
    }

    public Membro getResponsavel() {
        return responsavel;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    // SETTERS
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setResponsavel(Membro responsavel) {
        this.responsavel = responsavel;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

