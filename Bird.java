public abstract class Bird extends Animal {
     private static int numberOfBirds = 0;

    //Constructors
    public Birds(){
        super();
        numberOfBirds++;
        System.out.println("Bird Constructor called");
    }
     public Birds(String name){
        super(name);
        numberOfBirds++;
        System.out.println("Bird Constructor with name called");
    }

    //Methods

    public void makeSound(){
        System.out.println("Bird sounds");
    }

    public String getAnimalType(){
        return "Bird";
    }

    public int getNumberOfBirds(){
        return numberOfBirds;
    }
}
