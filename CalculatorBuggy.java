public class CalculatorBuggy {
    int result;

    // Bug 1: Missing return type (void or int)
    add(int a, int b) {
        result = a + b;
    }

    public int divide(int a, int b) {
        // Bug 2: No check for division by zero
        return a / b;
    }

    public static void main(String[] args) {
        // Bug 3: Calling non-static method directly from static main without an object
        System.out.println(divide(10, 0));
    }
}