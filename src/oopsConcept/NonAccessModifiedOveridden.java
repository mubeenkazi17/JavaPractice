package oopsConcept;

class Parent {
    static int lenght;
    static void display() {

        System.out.println("Parent static method");
    }
    private void operation()
    {
        System.out.println("Parent private method");
    }
    final void income()
    {
        System.out.println("Parent Final method");
    }
}

class Child extends Parent {

    static void display() {
        System.out.println("Child static method");
    }


    private void operation()
    {
        System.out.println("Child private method");
    }

  /*  final void income()
    {
        System.out.println("Child Final method");
    }*/
}

public class NonAccessModifiedOveridden {
    public static void main(String[] args) {
        //Static
        Parent p = new Child();
        p.display();  // Output: Parent static method

        Child c = new Child();
        Child.display();
        //c.operation();

    }
}

