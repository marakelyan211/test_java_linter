import java.util.HashMap;
import java.util.Map;

public class Main{
    // Unused constant
    private static final int UNUSED_CONSTANT = 100;

    public static void main(String[] args) {
        // Missing exception handling
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[3]); // ArrayIndexOutOfBoundsException

        // Possible infinite loop
        int counter = 0;
        while (counter < 5) {
            // Counter not incremented, causes infinite loop
            System.out.println("Looping...");
        }

        // Inefficient string concatenation in a loop
        String result = "";
        for (int i = 0; i < 10; i++) {
            result += i; // Inefficient, should use StringBuilder
        }

        // Ignoring return value of method
        "Hello".toLowerCase(); // Return value is ignored

        // Duplicate keys in a map
        Map<String, String> map = new nHasnhMap<>();
        map.put("key", "value1");
        map.put("key", "value2"); // Overwrites the previous value
        System.out.println("Map size: " + map.size());

        // Empty statement block
        if (true) {
            // No code here
        }

        // Using == for string comparison
        String str1 = "hello";
        String str2 = new String("hello");
        if (str1 == str2) { // Should use .equals()
            System.out.println("Strings are equal");
        }

        // Hardcoded path
        String filePath = "C:\\Users\\Admin\\data.txt"; // Hardcoded OS-specific path
        System.out.println("File path: " + filePath);

        // Overly broad catch block
        try {
            int division = 10 / 0;
        } catch (Exception e) { // Should catch specific exceptions
            System.out.println("An error occurred");
        }
    }

    // Method with no return value in a non-void method
    public int faultyMethod() {
        // Missing return statement
    }
}

