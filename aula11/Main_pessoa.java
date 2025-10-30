import java.util.ArrayList;

public class Main_pessoa {
    public static void main(String[] args){
        Professor p1 = new Professor("Fabio", "111", "A21");
        System.out.println(p1.imprimir());
    
        Aluno a1 = new Aluno("Pedro", "2222", "RA1");
        System.out.println(a1.imprimir());

        ArrayList<Pessoa> pList = new ArrayList<Pessoa>();
        pList.add(p1);
        pList.add(a1);
        
        for(Pessoa p : pList){
            if(p instanceof Aluno){
                System.out.println(p.imprimir());
            }
        }
    }

    
}
