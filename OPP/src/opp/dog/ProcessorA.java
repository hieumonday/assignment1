package opp.dog;

import java.util.ArrayList;
import java.util.Date;

class ProcessorA {

    public static void main(String args[]) {
        AnimalList animalList = new AnimalList();
        Dog dog1 = new Dog(1, "Hung", "4-1-2005", "black", "Husky");
        Dog dog2 = new Dog(2, "Khoi", "19-11-2005", "blue", "corgi");
        Cat cat1 = new Cat(3, "Han", "15-6-2004", "pink");
        Cat cat2 = new Cat(4, "Khai", "16-11-2003", "gray");
        animalList.addAnimal(dog1); // Sử dụng instanceof để kiểm tra
        animalList.addAnimal(dog2);
        animalList.addAnimal(cat1);
        animalList.addAnimal(cat2);

        // Hiển thị thông tin và thực hiện hành động
        animalList.display();
    }

}
