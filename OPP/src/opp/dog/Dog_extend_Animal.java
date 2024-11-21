package opp.dog;

import java.util.Date;

class Dog extends Animal {

    public Dog(int id, String source, String dateOfBirth, String color, String breed) {
        this.id = id;
        this.source = source;
        this.dateOfBirth = dateOfBirth;
        this.color = color;
        this.breed = breed;

    }
    private String breed; //giong loai

    Dog(String string, String hung) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void makeSound() {
        System.out.println("Gau gau");
    }

    @Override
    public String toString() {
        return "Dog [id=" + id + ", source=" + source + ", dateOfBirth=" + dateOfBirth
                + ", color=" + color + ", breed=" + breed + "]";
    }
}
