package Programs;

public class RemoveSpaces {
    public static void main(String[] args){
        String str = "Hello how are you";
        str = str.replaceAll(" ", "");
        System.out.println(str);
    }
}
