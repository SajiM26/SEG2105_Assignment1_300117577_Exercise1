package Exercise1;

import java.util.ArrayList;

public class AnimalTest {
    
    public static void main(String[] args){

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        ArrayList<Mammal> mammalList = new ArrayList<Mammal>();
        ArrayList<Bird> birdList = new ArrayList<Bird>();
        ArrayList<Dog> dogList = new ArrayList<Dog>();
        ArrayList<Parrot> parrotList = new ArrayList<Parrot>();



        for(int i=0;i<4;i++){
            if(i<2){
                Animal animal = new Dog("Animal"+i);
                Mammal mammal = new Dog("Mammal"+i);
                Bird bird = new Parrot("Bird"+i);
                Dog dog = new Dog("Dog"+i);
                Parrot parrot = new Parrot("Parrot"+i);

                animalList.add(animal);
                mammalList.add(mammal);
                birdList.add(bird);
                dogList.add(dog);
                parrotList.add(parrot);

            }else{
                Animal animal = new Dog();
                Mammal mammal = new Dog();
                Bird bird = new Parrot();
                Dog dog = new Dog();
                Parrot parrot = new Parrot();

                animalList.add(animal);
                mammalList.add(mammal);
                birdList.add(bird);
                dogList.add(dog);
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
