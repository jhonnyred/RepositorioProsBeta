public class Main_Func{
    public static void main(String[] args){
        Funcionario f1 = new Funcionario("Maria");
        Funcionario f2 = new Funcionario("Gerente Joao");
        Funcionario f3 = new Funcionario("Diretor Pedro");

        f3.addSubordinado(f2);
        f2.addSubordinado(f3);

        f3.imprimir();
        f3.imprimirSubordinados();
    }
} 