package stringConcept;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Callable;

public class StringPassword {

        String password;

        public static void main(String[] args) {
            char[] password = {'m', 'y', 'S', 'e', 'c', 'r', 'e', 't'};
            System.out.println("Before Password: " + password.length);

            // Print password values before changing
            System.out.println("Password Before: " + new String(password));

            // Fill the password array with '0'
            Arrays.fill(password, '0');

            // Print password values after changing
            System.out.println("Password After: " + new String(password));
        }


}
