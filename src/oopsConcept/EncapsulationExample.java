package oopsConcept;

public class EncapsulationExample {
    private String name;       // private field
    private int salary;



    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        if(salary>500) {
            this.salary = salary;
        }
    }

    // Public getter
    public String getName() {
        return name;
    }


    public int getSalary() {
        return salary;
    }
}

class ProtectedExample extends EncapsulationExample
{

}


class ExecuteProgram
{

    public static void main(String[] args) {
        EncapsulationExample encapsulationExample = new EncapsulationExample();
        encapsulationExample.setSalary(1000);
        //encapsulationExample.salary=1000;

        EncapsulationExample encapsulationExample2 = new EncapsulationExample();
      //  encapsulationExample.salary=0;

    }
}



