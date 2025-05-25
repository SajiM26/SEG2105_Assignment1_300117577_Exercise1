package Exercise1;

public class Mammal extends Animal{
    private static int numberOfMammals = 0;

    //Constructors
    public Mammal(){
        super();
        numberOfMammals++;
        System.out.println("Mammal Constructor called");
    }
     public Mammal(String name){
        super(name);
        numberOfMammals++;
        System.out.println("Mammal Constructor with name called");
    }

    //Methods

    public void makeSound(){
       System.out.println(getAnimalType()+" sounds");
    }

    public String getAnimalType(){
        return "Mammal";
    }

    public static int getNumberOfMammals(){
        return numberOfMammals;
    }

}
