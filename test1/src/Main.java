//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QodanaTest {
    // Intentionally unused variable
    private static final String UNUSED_CONSTANT = "This is unused";

    public static void main(String[] args) {
        // Example of a potential bug: Division by zero
        int number = 10;
        int result = divide(number, 0);

        // Hardcoded password (Security issue)
        String password = "12345"; //Avoid hardcoding sensitive information

        // Inefficient string concatenation in a loop
        String inefficientConcat = "";
        for (int i = 0; i < 10; i++) {
            inefficientConcat += i;
        }

        // Example of duplicate code
        greetUser("Alice");
        greetUser("Bob");
    }

    // Method with unused parameter
    private static int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Division by zero is not allowed!"); // Poor error handling
            return 0; // Return statement to avoid crash
        }
        return a / b;
    }

    private static void greetUser(String name) {

