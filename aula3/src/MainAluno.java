public class MainAluno{
    public static void main(String[] args){
        Aluno a = new Aluno();
        Aluno b = new Aluno();
        Aluno aluno1 = new Aluno();

        a.setRa("1111");
        a.setNome("maria");
        a.setCurso("ADS");

        b.setRa("2222");
        b.setNome("fabricio");
        b.setCurso("alimentos");

        System.out.println(a.getNome());
        System.out.println(b.getNome());
    }
}