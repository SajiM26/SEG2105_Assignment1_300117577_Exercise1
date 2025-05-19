import java.lang.reflect.Constructor;

public abstract class Animal implements SoundsMaker {
    private static int numberOfAnimals = 0;
    private String name;

    //Contructors

    public Animal(){
        System.out.println("Animal Constructor called");
        numberOfAnimals++;
        name = "Unknown Animal";
    }

    public Animal(String named){
        System.out.println("Animal Constructor with name called");
        numberOfAnimals++;
        name = named;
    }

    //Methods

    public abstract String getAnimalType();

    public int getNumberOfAnimals(){
        return numberOfAnimals;
    }

}
