import java.util.Arrays;

public class Zoo {
    Animal [] animals;
    String name;
    String City;
    final int nbrCages=25;

    int nbranimaux;



    public Zoo (){

    }

    public Zoo(String name,String City){


        animals= new Animal[nbrCages];
        this.name=name;
        this.City=City;
        this.nbranimaux=0;
    }

    public void displayZoo(){
        System.out.println("name of the zoo:"+name);
        System.out.println("The city of the zoo: "+City);
        System.out.println("the Zoo have: "+nbrCages+" cages");
        System.out.println("animal: " );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("name of the zoo: ").append(name).append("\n");
        sb.append("city: ").append(City).append("\n");
        sb.append("Number of Cages: ").append(nbrCages).append("\n");
        sb.append("Number of Animals: ").append(nbranimaux).append("\n");

        sb.append("Animals:\n");

        for (int i = 0; i < nbranimaux; i++) {
            sb.append(animals[i]).append("\n");
        }

        return sb.toString();
    }
    int searchAnimal(Animal animal) {
        for (int i = 0; i < nbranimaux; i++) {

            if (animals[i].name.equals(animal.name)) {
                return i;
            }

        }return -1;





    }

    boolean addAnimal(Animal animal) {

       if (nbranimaux<nbrCages && searchAnimal(animal)==-1 ){

           animals[nbranimaux]=animal;
           System.out.println("the animal is added sucefuly");
           nbranimaux++;
           return true;

       }
           
        else {
           System.out.println("there is no place for this animal or  this animal already exist");
           return false;
       }

    }

    boolean removeAnimal(Animal animal){

        if (searchAnimal(animal) == -1){
            return false;
        }
        for (int i =searchAnimal(animal) ; i< nbranimaux; i++){
            animals[i] = animals[i+1];
        }
        animals[nbranimaux]= null;
        nbranimaux--;
        return true;

    }

    boolean isZooFull(Zoo z1){
        if(z1.nbranimaux==z1.nbrCages){
            return true;


        }
        else {
            int x=z1.nbrCages-z1.nbranimaux;
            System.out.println("there is " + x +"places left");
            return false;
        }



    }
    Zoo comparerZoo(Zoo z1, Zoo z2){
       if(z1.nbranimaux> z2.nbranimaux){
        return z1;
       }else {
           return z2;
       }


    }


}
