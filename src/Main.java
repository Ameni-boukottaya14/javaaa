public class Main {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("bel","Sousse",20);
        Animal lion = new Animal("lion","lion",20,true);
        Animal cat = new Animal("lion","lion",20,true);

        myZoo.displayZoo();
        lion.displayAnimal();
        System.out.println(myZoo);
        System.out.println(lion);
        System.out.println("\n");
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.searchAnimal(cat));
    }

}