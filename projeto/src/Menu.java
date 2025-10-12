public class Menu{
    // CONSTRUTOR
    public Menu(){}

    //  MÉTODOS
    public void limpaTela(){
        for(int i=0; i<100; i++){
            System.out.println();
        }
    }

    public void menuPrincipal(){
        System.out.println("1 - Cadastrar Projeto\n"+
                           "2 - Adicionar Tarefa\n"+
                           "3 - Atribuir Membro a tarefa\n"+
                           "4 - Listar Projetos\n"+
                           "5 - Procurar ID projeto\n"+
                           "6 - Sair");
    }
}