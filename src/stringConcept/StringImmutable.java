package stringConcept;

public class StringImmutable {
    public static void main(String[] args) {

        // Step 1: Create an initial string
        String str1 = "Hello";
        System.out.println("Original String (str1): " + str1);

        // Step 2: Try to modify the string using concatenation
        str1 = str1 + " World";  // This creates a new string
        System.out.println("Modified String (str1): " + str1);
        String str3="Hello";

        // Step 5: Check if the original string and modified string refer to different memory locations
        System.out.println("Memory address of str1 appended: " + System.identityHashCode(str1));
        System.out.println("Memory address of the original stringl \"Helo\": " + System.identityHashCode("Hello"));
        System.out.println("Memory address of the original string \"str3\": " + System.identityHashCode(str3));
        System.out.println(str3=="Hello");

        String str4 = new String("Hello"); // Not created in SCP but in Heap memory

        System.out.println("str4 stored in Heap "+(str4=="Hello"));
        System.out.println("Memory address of str4 appended: " + System.identityHashCode(str4));
        str4=str4.intern();

        System.out.println("After Inserting in Pool using intern "+(str4=="Hello"));
        System.out.println("Memory address After intern of str4 appended: " + System.identityHashCode(str4));
    }
}
