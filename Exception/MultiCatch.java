package TryCatch;

public class MultiCatch {
    public static void main(String[] args) {
        try {
            // Code that might throw exceptions
            int[] numbers = {1, 2, 3};
            int result = numbers[5];
            int value = 10 / result;
            System.out.println("Result: " + value);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {

            if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("Array index out of bounds: " + e.getMessage());
            } else if (e instanceof ArithmeticException) {
                System.out.println("ArithmeticException occurred: " + e.getMessage());
            }
        } catch (Exception exc) {

            System.out.println("Some other exception occurred: " + exc.getMessage());
        }
    }
}

