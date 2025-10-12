import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        ArrayList<Projeto> projList = new ArrayList<Projeto>();
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        boolean quit = true;
        int opcao;
        do{
            menu.limpaTela();
            menu.menuPrincipal();
            System.out.print("== > ");
            opcao = input.nextInt();
            input.nextLine();
            switch(opcao){
                case 1:{
                    // Criar Projeto
                    menu.limpaTela();
                    System.out.print("Projeto: ");
                    String projeto = input.nextLine(); 
                    System.out.print("\nID: ");
                    int id = input.nextInt();
                    input.nextLine(); 
                    projList.add(new Projeto(id, projeto));
                    menu.limpaTela();
                    System.out.println("Projeto Criado ENTER para continuar");
                    input.nextLine();
                    break;
                }

                case 2: {
                    menu.limpaTela();
                    // Adicionar Tarefa
                    System.out.println("ID: ");
                    int id = input.nextInt();
                    input.nextLine();
                    for (Projeto p : projList){
                        if(id == p.getId()){
                            menu.limpaTela();
                            p.print();
                            p.listarTarefas();

                            // TAREFA
                            System.out.println("TAREFA\n");
                            System.out.print("ID: ");
                            int tarefaId = input.nextInt();
                            input.nextLine();
                            System.out.print("Descricao: ");
                            String descricao = input.nextLine();
                            System.out.print("Status: ");
                            String status = input.nextLine();

                            // MEMBRO
                            System.out.println("\n\nMEMBRO RESPONSAVEL");
                            System.out.print("Nome: ");
                            String nome = input.nextLine();
                            System.out.print("\nCargo: ");
                            String cargo = input.nextLine();
                            Membro membro = new Membro(nome, cargo);

                            p.adicionarTarefa(id, descricao, membro, status);
                            System.out.println("Tarefa criada pressione ENTER para continuar");
                            input.nextLine();
                        }
                    }
                    break;
                }
                case 3: {
                    // Membro a tarefa
                    menu.limpaTela();
                    System.out.println("ID: ");
                    int id = input.nextInt();
                    input.nextLine();
                    for (Projeto p : projList){
                        if(id == p.getId()){
                            menu.limpaTela();
                            p.print();
                            p.listarTarefas();

                            // PROCURANDO TAREFA
                            menu.limpaTela();
                            System.out.println("Selecione a tarefa");
                            System.out.println("ID: ");
                            int idTarefa = input.nextInt();
                            input.nextLine();
                            for(Tarefa t : p.tareList){
                                if(idTarefa == t.getId()){
                                    // MEMBRO
                                    System.out.println("\n\nMEMBRO");
                                    System.out.print("Nome: ");
                                    String nome = input.nextLine();
                                    System.out.print("\nCargo: ");
                                    String cargo = input.nextLine();
                                    Membro membro = new Membro(nome, cargo);
                                    t.setResponsavel(membro);
                                    System.out.println("Membro adicionado pressione ENTER para continuar");
                                    input.nextLine();
                                }
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    menu.limpaTela();
                    System.out.println("LISTA DE PROJETOS");
                    for(Projeto p : projList){
                        p.print();
                    }
                    System.out.println("pressione ENTER para continuar");
                    input.nextLine();
                    break;
                }
                case 5: {
                    menu.limpaTela();
                    System.out.println("ID: ");
                    int id = input.nextInt();
                    input.nextLine();
                    for(Projeto p: projList){
                        if(id == p.getId()){
                            p.print();
                            p.listarTarefas();
                        }
                    }
                    break;
                }
                case 6: {
                    quit = false;
                    break;
                }
            }
        }while(quit);
    }
}