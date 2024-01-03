package TryCatch;

public class TryCatch {
    public static void main(String[] args) {
        //Try with catch block
        try {
            int[] number={1,2,3,4};
            System.out.println(number[4]);
        }
        catch (Exception e){
            System.err.println("something went rong");
        }

    }
}
