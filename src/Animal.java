public class Animal {

    String Family;
    String name;
    int age ;
    boolean isMammal;

    public Animal(){

    }

    public Animal(String Family, String name ,int age ,Boolean isMammal)
    { this.Family=Family;
        this.name=name;
        this.age=age;
        this.isMammal=isMammal;


            }

    @Override
    public String toString() {
        return "Animal{" +
                "Family='" + Family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
