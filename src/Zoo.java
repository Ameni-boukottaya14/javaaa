import java.util.Arrays;
import java.util.Objects;

public class Zoo {
    Animal [] animals;
    String name;
    String city;
    int nbrCages;
    int nbrAnimal;
    public Zoo() {
    }
    public Zoo( String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    void displayZoo(){
        System.out.println(name+" "+city+" "+nbrCages);
        for(int i=0; i<nbrAnimal;i++){
            System.out.println(animals[i]);
        }
    }

    @Override
    public String toString() {
        return "Zoo{" +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                ", nbrAnimal=" + nbrAnimal +
                '}';

    }

    boolean addAnimal(Animal animal){
        if(searchAnimal(animal)!=-1 || nbrAnimal==nbrCages) {
            return false;
        }
        animals[nbrAnimal]=animal;
        nbrAnimal++;
        return true;
    }


    int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrCages; i++) {
            if (Objects.equals( animal.name,animals[i].name)) {
                return i;
            }

    }
        return index;
    }
    boolean removeAnimal(Animal animal){
        int x= searchAnimal(animal);
        if (x == -1)
            return false;
        for (int i = x; i<nbrAnimal; i++){
            animals[i]=animals[i+1];
        }
        animals[nbrAnimal]=null;
        nbrAnimal--;
        return true;
    }











}
