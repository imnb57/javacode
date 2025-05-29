// 3. Write a Java program to create a class called "Dog" with a name and breed attribute. Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Breed: " + breed);
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Khaire", "Labrador");
        Dog dog2 = new Dog("Kaley", "Retriever");

        dog1.setName("Charlie");
        dog2.setBreed("Husky");

        dog1.displayInfo();
        dog2.displayInfo();
    }
}

