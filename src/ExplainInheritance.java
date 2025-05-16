public class ExplainInheritance {

    private String name;

    public ExplainInheritance(String name) {
        this.name = name;
    }

    public void getName()
    {
        System.out.println("My name is :"+name);
    }

    public void getName(String name)
    {

    }
    public void getName(String name, String lastName)
    {

    }

    public void getAddress(int a, int b) throws RuntimeException
    {
        System.out.println("My Address is Hydrabad");
    }
}

class SubInheritance extends ExplainInheritance
{
    public SubInheritance(String name) {
        super(name);
    }


    @Override
    public void getAddress(int a, int b) throws RuntimeException
    {
        System.out.println("My Address is Pune");
    }


    public static void main(String[] args) {

        ExplainInheritance subInheritance = new SubInheritance("Mubeen");
        //subInheritance.getAddress();
    }
}
