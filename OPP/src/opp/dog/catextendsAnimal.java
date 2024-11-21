package opp.dog;

class Cat extends Animal {

    public Cat(int id, String source, String dateOfBirth, String color) {
        this.id = id;
        this.source = source;
        this.dateOfBirth = dateOfBirth;
        this.color = color;
    }

    @Override
    void makeSound() {
        System.out.println("Meo meo");
    }

    @Override
    public String toString() {
        return "Cat [id=" + id + ", source=" + source + ", dateOfBirth=" + dateOfBirth
                + ", color=" + color + "]";
    }
}
