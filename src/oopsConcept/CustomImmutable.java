package oopsConcept;


// Make class final so its not extended
// make data as private final so its not changed later using reflection
// No setter methods
// For Object use Defensive copy

public final class CustomImmutable {

    private final String customerName;
    private final Address address; //mutable object

    CustomImmutable(String customerName, Address address)
    {
        this.customerName=customerName;
        this.address= new Address(address.getCity(),address.getPinCode());
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public Address getAddress()
    {
        return new Address(address.getCity(),address.getPinCode());
    }

    @Override
    public String toString() {
        return "CustomImmutable{" +
                "customerName='" + customerName + '\'' +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Address address = new Address("Pune",411040);

        CustomImmutable customImmutable = new CustomImmutable("John Doller",address);

        System.out.println("Before Custom Immutable : "+customImmutable);
         address.setCity("Hydrabad");
        System.out.println("After Custom Immutable : "+customImmutable);
     /*   customImmutable.getAddress();

        Address address2 = null;
        address2.setCity("dfer");
        address2.setPincode(2332);
        System.out.println("address2" + address2);*/

    }
}





