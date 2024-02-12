package Programs;

public class StringHasNumeric {
    public static void main(String args[]) {
        String sample = "krishna64";
        System.out.println("String is"+sample);
        for (int i = 0; i < sample.length(); i++)
            if (Character.isDigit(sample.charAt(i))) {
                System.out.println("Numeric characters in String = "+sample.charAt(i));

            }
    }
}
