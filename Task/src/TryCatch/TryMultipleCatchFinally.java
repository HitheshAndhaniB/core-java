package TryCatch;

public class TryMultipleCatchFinally {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[8];
            int value = 10 / result;
            System.out.println("Result: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException occurred: " + ex.getMessage());
        }
        finally {
            System.out.println("Excecute finally block");
        }
        System.out.println("Running TryMultipleCatchFinally");
    }
}
