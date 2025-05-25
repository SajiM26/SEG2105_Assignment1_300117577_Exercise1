public abstract class Animal implements SoundsMaker {
    private static int numberOfAnimals = 0;
    private String name;

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

    public static int getNumberOfAnimals(){
        return numberOfAnimals;
    }

}
