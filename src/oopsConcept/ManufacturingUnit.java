package oopsConcept;

public abstract class ManufacturingUnit {

    private int wheel;

    ManufacturingUnit(int wheel)
    {
        this.wheel=wheel;
    }
    abstract void carType();
    abstract void colorsOption();
    abstract void seatingOption();

    void engine()
    {
        //1000
        System.out.println("This is a Engine Method");
    }

    void manufacture()
    {
        //1000
        System.out.println("This is a manufacture Method");
    }

}

class Kia extends ManufacturingUnit
{

    Kia(int wheel) {
        super(wheel);
    }

    @Override
    void carType() {
        engine();
        System.out.println("Car Type is SUV");
    }

    @Override
    void colorsOption() {
        System.out.println("Color Option 4");
    }

    @Override
    void seatingOption() {
        System.out.println("Seat Option 4");
    }

    public static void main(String[] args) {
        Kia kia= new Kia(10);
    }
}




