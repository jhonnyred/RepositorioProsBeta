public class Main{
    public static void main(String[] args){
        // cria uns pets
        Pet p1 = new Pet("Rex", "Vira-lata", 4);
        Pet p2 = new Pet("Luna", "Poodle", 2);
        Pet p3 = new Pet("Thor", "Pitbull", 5);

        // cria um tutor
        Tutor t1 = new Tutor("Giovanni", "123.456.789-00");

        // adiciona pets (precisa criar o método antes)
        t1.addPet(p1);
        t1.addPet(p2);
        t1.addPet(p3);

        // imprime o bagulho
        t1.imprimir();
    }
}