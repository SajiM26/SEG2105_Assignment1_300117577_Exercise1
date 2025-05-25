package Exercise1;

public abstract class Animal implements SoundsMaker {
    private static int numberOfAnimals = 0;
    protected String name;

    //Contructors

    public Animal(){
        System.out.println("Animal Constructor called");
        numberOfAnimals++;
        name = "Unknown Animal";
    }

    public Animal(String name){
        System.out.println("Animal Constructor with name called");
        numberOfAnimals++;
        this.name = name;
    }

    //Methods

    public abstract String getAnimalType();

    public void makeSound(){
        if(name != "Unknown Animal"){
            System.out.println("Named animal sound");
        }else{
             System.out.println("Unknown animal sound");
        }
    }

    public static int getNumberOfAnimals(){
        return numberOfAnimals;
    }

}
