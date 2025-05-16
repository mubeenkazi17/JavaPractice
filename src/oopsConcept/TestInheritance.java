package oopsConcept;
// Parent Class (Superclass)
class Animal {
    // Fields
    String name;
    int age;

    public Animal()
    {

    }
    // Constructor to initialize fields
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    public void speak() {
        System.out.println(name + " makes a sound");
    }

    // Method to display animal's details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Child Class (Subclass)
class Dog extends Animal {
    // Additional field specific to Dog
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);  // Call to parent class constructor
        this.breed = breed;  // Initialize breed for Dog
    }

    // Method specific to Dog
    public void displayBreed() {
        System.out.println("Breed: " + breed);
    }
}

class Cat extends Animal{
    private String food;
    Cat(String name, int age, String food)
    {
        super(name,age);
        this.food=food;
    }
    public void catFood()
    {
        System.out.println("Cat Food is "+food);
    }
}
// Main class to test inheritance
public class TestInheritance {
    public static void main(String[] args) {
        // Create an object of Dog (child class)
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");

        // Access inherited fields and methods from Animal class
        dog.displayDetails();  // Inherited from Animal class
        dog.speak();           // Overridden method in Dog class
        dog.displayBreed();    // Specific to Dog class

        Cat cat= new Cat("Meow", 5, "Mice");
        cat.displayDetails();
        cat.speak();
        cat.catFood();
    }
}
