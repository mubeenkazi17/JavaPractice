package oopsConcept;

import javax.crypto.spec.PSource;
import java.util.HashMap;

public class FinalHashMap {

    public static void main(String args[])
    {
        final int x = 10;
        //x = 20;

        final HashMap<String, String> myMap = new HashMap<>();

        myMap.put("A", "Apple");  // ✅ Allowed
        myMap.put("B", "Banana"); // ✅ Allowed

     //   myMap = new HashMap<>(); //❌ Compilation Error (reassignment not allowed)

        final Address address = new Address();
        address.setCity("Pune");
        address.setPincode(411002);
      //  address=new Address(); //❌ Compilation Error (reassignment not allowed)

    }
}

