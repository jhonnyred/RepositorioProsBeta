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
        System.out.println("1 - Adicionar Faixa\n"+
                           "2 - Remover Faixa\n"+
                           "3 - Reproduzir Faixa\n"+
                           "4 - Listar Todas Faixas\n"+
                           "5 - Sair");
    }
}