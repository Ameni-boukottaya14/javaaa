import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Animal lion=new Animal("Tigers","oy",2,true);
        Animal Tuna =new Animal("Fish","yo",2,true);
        Animal Elephant=new Animal("mamal","sars",2,true);

        Zoo myzoo =new Zoo("myZoo","Belvedaire");
        Zoo myzoo1 =new Zoo("myzoo1","Ariana");


        //addd animals

        myzoo.addAnimal(lion);
        myzoo.addAnimal(Tuna);
        myzoo.addAnimal(Elephant);

        //adding an already existing animal
        myzoo.addAnimal(lion);
        System.out.println("\n");
        //display of the zoo
        System.out.println(myzoo.toString());
        System.out.println("\n");
        //search of the desired animal
        System.out.println(myzoo.searchAnimal(lion));
        //Deleting
        System.out.println(myzoo.removeAnimal(lion));
        //Dispaly of the chenges
        System.out.println(myzoo.toString());
        System.out.println(myzoo.isZooFull(myzoo));
        System.out.println();
        System.out.println(myzoo.comparerZoo(myzoo,myzoo1));











    }
}