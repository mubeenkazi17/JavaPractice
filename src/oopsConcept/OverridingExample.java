package oopsConcept;
// Parent Class (Superclass)
class Animals {
    // Fields
    String name;
    int age;

    // Constructor to initialize fields
    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    protected void speak() throws Exception{
        System.out.println(name + " makes a sound");
    }

    // Method to display animal's details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Child Class (Subclass)
class Horse extends Animals {
    // Additional field specific to Dog
    String breed;

    public Horse(String name, int age, String breed) {
        super(name, age);  // Call to parent class constructor
        this.breed = breed;  // Initialize breed for Dog
    }
    @Override
    public void speak() throws RuntimeException
    {
        System.out.println("makes a sound like Horse");
    }
    // Method specific to Dog
    public void displayBreed() {
        System.out.println("Breed: " + breed);
    }
}

// Main class to test inheritance
public class OverridingExample {
    public static void main(String[] args) throws Exception {
        // Create an object of Dog (child class)
        Animals animals= new Horse("Buddy", 3, "Golden Retriever");

        // Access inherited fields and methods from Animal class
        animals.displayDetails();  // Inherited from Animal class
        animals.speak();           // Overridden method in Dog class

        animals= new Animals("Catty",5);
        animals.displayDetails();  // Inherited from Animal class
        animals.speak();           // Overridden method in Dog class

    }
}
