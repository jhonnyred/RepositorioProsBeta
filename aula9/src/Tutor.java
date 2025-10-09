import java.util.ArrayList;

class Tutor{
    // ATRIBUTOS
    private ArrayList<Pet> listPet = new ArrayList<Pet>(); 
    private String nome;
    private String cpf;

    // CONSTRUTOR
    public Tutor(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    // MÉTODOS
    public void addPet(Pet p){
        listPet.add(p);
    }
    public void imprimir(){
        System.out.println("\nNome: " +this.nome+
                           "\nCPF: " +this.cpf);
        
        for(Pet p : listPet){
            p.imprimir();
        }
    }

}