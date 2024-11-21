package opp.dog;

import java.util.ArrayList;

public class AnimalList {

    ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {

        if (animal instanceof Dog) {
            System.out.println("add a dog to the list");
        } else if (animal instanceof Cat) {
            System.out.println("add a cat to the list");
        }
        animals.add(animal);
    }

    public void display() {
        for (Animal animal : animals) {
            System.out.println(animal.toString());
            animal.makeSound();
        }

    }
}
