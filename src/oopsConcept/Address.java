package oopsConcept;


import java.util.Objects;

public class Address {
    // Fields
    String city;
    int pinCode;

    public Address(String city, int pinCode) {
        this.city = city;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }

    public Address() {
    }

    public static void state()
    {
        System.out.println("This is Maharhastra");
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPincode(int pinCode) {
        this.pinCode = pinCode;
    }

    public static void printAddress()
    {
        System.out.println("Address is null");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return pinCode == address.pinCode && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, pinCode);
    }

    public static void main(String[] args) {
        Address address = null;
        address.state();
    }
}