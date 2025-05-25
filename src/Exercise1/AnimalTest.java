package Exercise1;

import java.util.ArrayList;

public class AnimalTest {
    
    public static void main(String[] args){

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        ArrayList<Mammal> mammalList = new ArrayList<>();
        ArrayList<Bird> birdList = new ArrayList<Bird>();
        ArrayList<Dog> dogList = new ArrayList<Dog>();
        ArrayList<Parrot> parrotList = new ArrayList<Parrot>();

        for(int j=0 ; j<4 ; j++){
            if(j<2){
                Animal a = new Animal() {
                    public String getAnimalType(){
                        return "Animal";
                    }
                };
                animalList.add(a);
            }
            else{
                Animal a = new Animal("a"+j) {
                    public String getAnimalType(){
                        return "Animal";
                    }
                };
                animalList.add(a);
            }
        }
        
        mammalList.add(new Mammal());
        mammalList.add(new Mammal());
        mammalList.add(new Mammal("m1"));
        mammalList.add(new Mammal("m2"));

        birdList.add(new Bird());
        birdList.add(new Bird());
        birdList.add(new Bird("b1"));
        birdList.add(new Bird("b2"));

        dogList.add(new Dog());
        dogList.add(new Dog());
        dogList.add(new Dog("d1"));
        dogList.add(new Dog("d2"));

        parrotList.add(new Parrot());
        parrotList.add(new Parrot());
        parrotList.add(new Parrot("p1"));
        parrotList.add(new Parrot("p2"));
    


        
        for(Animal a:animalList){
            a.makeSound();
        }
        for(Mammal m:mammalList){
            m.makeSound();
        }
         for(Bird b:birdList){
            b.makeSound();
        }
        for(Dog d:dogList){
            d.makeSound();
        }
        for(Parrot p:parrotList){
            p.makeSound();
        }

        System.out.println("Number of Animals total: "+Animal.getNumberOfAnimals()+".");
        System.out.println("Number of Mammals total: "+Mammal.getNumberOfMammals()+".");
        System.out.println("Number of Birds total: "+Bird.getNumberOfBirds()+".");






    }
}
