package Programs;

public class SplitString {
    public static void main(String[] args) {
        String str = "Java is a programming language. James Gosling developed it.";
        System.out.println("String: "+str);
        String[] strSplit = str.split(" ");
        System.out.println("Splitting String...");
        for (int i = 0; i < strSplit.length; i++)
            System.out.println(strSplit[i]);
    }
}