public class Dog extends Mammal{
    
    //Constructors
    public Dog(){
        super();
        System.out.println("Dog Constructor called");
    }

    public Dog(String name){
        super(name);
        System.out.println("Dog Constructor with name called");
    }

    //Methods
    public void makeSound(){
        System.out.println("Bark Bark, woof woof");
    }

     public String getAnimalType(){
        return "Dog";
    }
}
