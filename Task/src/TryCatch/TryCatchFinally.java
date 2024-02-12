package TryCatch;

public class TryCatchFinally {
        public static void main(String[] args) {
            try {
                int[] number={1,2,3,4};
                System.out.println(number[4]);
            }
            catch (Exception e){
                System.err.println("something went rong");
            }
            finally {
                System.out.println("execute finally block");
            }

        }
    }

