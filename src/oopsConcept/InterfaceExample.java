package oopsConcept;

// Interface definition
interface Drawable {
    public final int size = 0;

    void draw(); // Abstract method - implementation is hidden from the user

    // Default method with a common implementation (Java 8+)
    default void display() {
        System.out.println("Displaying the shape.");
    }
}

// Concrete class implementing the interface
class Circle implements Drawable, Runnable {
    @Override
    public void draw() {
        // Concrete implementation of draw() - hidden complexity
        System.out.println("Drawing a Circle.");
    }

    @Override
    public void run() {

    }
}

class Square implements Drawable {
    @Override
    public void draw() {
        // Concrete implementation of draw() - hidden complexity
        System.out.println("Drawing a Square.");
    }
}

// Main Class to test
public class InterfaceExample{
    public static void main(String[] args) {
        // You don't need to know how Circle or Square draws
        Drawable shape1 = new Circle();
        shape1.draw();  // "Drawing a Circle."
      //  shape1.display(); // "Displaying the shape."

        Drawable shape2 = new Square();
        shape2.draw();  // "Drawing a Square."
      //  shape2.display(); // "Displaying the shape."
    }
}
