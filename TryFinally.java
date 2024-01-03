package TryCatch;

public class TryFinally {
    public static void main(String[] args) {
        try {
            int[] number={1,2,3,4};
            System.out.println(number[4]);
        }
        finally {
            System.out.println("Execute finally block");
        }
    }
}
