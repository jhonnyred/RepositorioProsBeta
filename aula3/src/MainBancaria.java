public class MainBancaria{
    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria();

        conta1.setId("248702");
        conta1.imprimir();
        conta1.depositar(500);
        conta1.imprimir();
        conta1.sacar(250);
        conta1.imprimir();
    }
}