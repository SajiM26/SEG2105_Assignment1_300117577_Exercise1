package Exercise1;

public class Parrot extends Bird {
    //Constructors
    public Parrot(){
        super();
        System.out.println("Parrot Constructor called");
    }

    public Parrot(String name){
        super(name);
        System.out.println("Parrot Constructor with name called");
    }

    public void makeSound(){
        System.out.println("Mimic or chirp");
    }

    public String getAnimalType(){
        return "Parrot";
    }
}
