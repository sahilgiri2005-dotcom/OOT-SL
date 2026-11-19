public class CalculatorFixed {
    int result;

    // Fixed 1: Added return type 'int'
    public int add(int a, int b) {
        result = a + b;
        return result;
    }

    // Fixed 2: Guarded against division by zero
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0.0;
        }
        return (double) a / b;
    }

    public static void main(String[] args) {
        // Fixed 3: Instantiated object before calling instance methods
        CalculatorFixed calc = new CalculatorFixed();
        System.out.println("Sum: " + calc.add(10, 5));
        System.out.println("Division (10 / 2): " + calc.divide(10, 2));
        System.out.println("Division (10 / 0): " + calc.divide(10, 0));
    }
}