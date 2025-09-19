public class Main{
    public static void main(String[] args){
        Pocao p1 = new Pocao("Poison");
        p1.setPoder(30);
        p1.setTipo("Veneno");

        Pocao p2 = new Pocao("Sleeping", 10);
        p2.setTipo("Sonifero");

        Pocao p3 = new Pocao("Smartness", 50, "inteligencia");

        p1.usar();
        p2.usar("voce");
        p3.usar("Lenin", 3);
    }
}