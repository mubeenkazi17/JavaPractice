package oopsConcept;

public class EncapsulationImmutable {

    private final String name;       // private field
    private final int salary;

    EncapsulationImmutable(String name, int salary)
    {
        this.name=name;
        this.salary=salary;
    }


    // Public getter
    public String getName() {
        return name;
    }


    public int getSalary() {
        return salary;
    }

    public static void main(String args[])
    {
        EncapsulationImmutable encapsulationExample= new EncapsulationImmutable("John",1000);

        System.out.println("Name "+encapsulationExample.getName()+" Salary "+encapsulationExample.getSalary());


    }
}

