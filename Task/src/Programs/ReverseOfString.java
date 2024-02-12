package Programs;

public class ReverseOfString
{
    public static void main(String[] args) {
        String string = "Dream big";
        for(int i = string.length()-1; i >= 0; i--){
            System.out.print(string.charAt(i));
        }

    }
}
