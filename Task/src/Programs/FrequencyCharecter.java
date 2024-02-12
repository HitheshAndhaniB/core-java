package Programs;

public class FrequencyCharecter {
    public static void main(String[] args) {
        String input1 = "Java Programming is fun";
        System.out.println("The string is defined as: " +input1);
        char input2 = 'x';
        System.out.println("The character is defined as: " +input2);
        int counter = 0;
        for(int i = 0; i < input1.length(); i++) {
            if(input2 == input1.charAt(i)) {
                ++counter;
            }
        }
        System.out.println("The frequency of " + input2 + " is " + counter );
    }
}
