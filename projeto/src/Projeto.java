import java.util.ArrayList;

public class Projeto{
    // ATRIBUTOS
    public ArrayList<Tarefa> tareList = new ArrayList<Tarefa>();
    private String nome;
    private int id;

    // CONSTRUTOR
    public Projeto(int id, String nome){
        this.id = id;
        this.nome = nome;
    }    

    // MÉTODOS
    public void adicionarTarefa(int id, String descricao, Membro membro, String status){
        Tarefa t = new Tarefa(id, descricao, membro, status);
        tareList.add(t);
    }

    public void removerTarefa(Tarefa t){
        tareList.remove(t);
    }

    public void listarTarefas(){
        for(Tarefa t: tareList){
            t.getDescricao();
            System.out.println();
        }
    } 

    public String print(){
        int count=0;
        for(int i=0; i<tareList.size(); i++){
            count++;
        }
        return "Projeto: " +this.nome+ "Tarefas Atribuida: " +String.valueOf(count);
    }

    // GETTERS
    public int getId(){
        return this.id;
    }
}