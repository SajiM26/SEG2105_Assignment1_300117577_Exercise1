import java.util.ArrayList;

public class AnimalTest {
    
    public static void main(String[] args){

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        ArrayList<Mammal> mammalList = new ArrayList<Mammal>();
        ArrayList<Bird> birdList = new ArrayList<Bird>();
        ArrayList<Dog> dogList = new ArrayList<Dog>();
        ArrayList<Parrot> parrotList = new ArrayList<Parrot>();
        String[] names = {"Kiwi","Cat","Danger","Horse"};


        for(int i=0;i<4;i++){
            if(i%2==0){
                Dog dog = new Dog();
                animalList.add(dog);
                mammalList.add(dog);
                dogList.add(dog);

                Parrot parrot = new Parrot(names[i]);
                animalList.add(parrot);
                birdList.add(parrot);
                parrotList.add(parrot);
            }else{
                Dog dog = new Dog(names[i]);
                animalList.add(dog);
                mammalList.add(dog);
                dogList.add(dog);

                Parrot parrot = new Parrot();
                animalList.add(parrot);
                birdList.add(parrot);
                parrotList.add(parrot);
            }
        }

        for(Animal a:animalList){
            a.makeSound();
        }

        for(Mammal m:mammalList){
            m.makeSound();
        }

        for(Dog d:dogList){
            d.makeSound();
        }

        for(Bird b:birdList){
            b.makeSound();
        }

        for(Parrot p:parrotList){
            p.makeSound();
        }

        System.out.println("Number of Animals total: "+Animal.getNumberOfAnimals()+".");
        System.out.println("Number of Mammals total: "+Mammal.getNumberOfMammals()+".");
        System.out.println("Number of Birds total: "+Bird.getNumberOfBirds()+".");






    }
}
