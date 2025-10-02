import java.util.ArrayList;
import java.util.Scanner;

public class MainArraylist{
    public static void main(String[] args){
        ArrayList<String> listNomes = new ArrayList<String>();
        listNomes.add("Nome1");
        listNomes.add("Nome2");
        listNomes.add("Nome3");

        System.out.println(listNomes.get(1));

        for (String nome : listNomes){
            System.out.println(nome);
        }

        // eu juntei as duas anotações por pura preguiça
        // de criar mais um arquivo para essa main

        ArrayList<Pessoa> listPessoa = new ArrayList<Pessoa>();
        
        Pessoa p1 = new Pessoa(); 
        Pessoa p2 = new Pessoa("22222222222", "João", 'M', 25); 
        Pessoa p3 = new Pessoa("33333333333", "Maria"); 

        // ele fez uma firula com o do while
        Scanner input = new Scanner(System.in);
        int count = 0

        do {
            System.out.print("Nome: ");
            String nome = input.nextLine();
            pe.setNome(nome);

            System.out.print("Idade: ");
            String idade = input.nextInt();
            pe.setNome(idade);

            Pessoa pe = new Pessoa(nome, idade);
            listPessoa.add(pe);
            count++;
        }while(count>3);
    }
}