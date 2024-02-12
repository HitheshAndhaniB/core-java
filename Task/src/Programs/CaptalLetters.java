package Programs;

public class CaptalLetters{
    public static void main(String []args) {
        System.out.println("Checking for Uppercase character...");
        String val = "KiNg";
        for (int i=0;i<val.length();i++)
        if (Character.isUpperCase(val.charAt(i))) {
            System.out.println(val.charAt(i));
        }
    }
}
