public class Main{
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();

        p1.setCPF("3434523422324-23");
        p1.setNome("Maria");
        p1.setSexo('F');
        p1.setIdade(23);

        p1.imprimir();
    }
}