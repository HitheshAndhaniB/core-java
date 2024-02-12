package Programs;

public class FindSpecialChar {
    public static void main(String[] args) {
        String str="Pr!ogr#am%m*in&g Lan?#guag(e";
        for (int i=0;i<str.length();i++){
            if (!Character.isLetterOrDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))){
            System.out.print(str.charAt(i));
        }
        }

    }
}
