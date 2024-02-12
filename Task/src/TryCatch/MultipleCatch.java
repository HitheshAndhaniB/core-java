package TryCatch;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int result = numbers[4];
            int value = 10 / result;
            System.out.println("Result: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds: " + e.getMessage());
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException occurred: " + ex.getMessage());
        } catch (Exception exc) {
            System.out.println("Some other exception occurred: " + exc.getMessage());
        }
    }
}

