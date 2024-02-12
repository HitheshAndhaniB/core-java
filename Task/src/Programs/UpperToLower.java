package Programs;

public class UpperToLower {


    public static void main(String[] args) {
        String str1 = "good morning";
        System.out.println("covert to upper= " + str1.toUpperCase());
        String str2 = "GOOD MORNING";
        System.out.println("covert to lower= " + str2.toLowerCase());


        String str3 = "Great Power";
        StringBuffer newStr = new StringBuffer(str1);

            for (int i = 0; i < str3.length(); i++) {

                if (Character.isLowerCase(str3.charAt(i))) {
                    newStr.setCharAt(i, Character.toUpperCase(str3.charAt(i)));
                } else if (Character.isUpperCase(str3.charAt(i))) {
                    newStr.setCharAt(i, Character.toLowerCase(str3.charAt(i)));
                }
            }
            System.out.println("String after Uppercase  : " + newStr);
        }
    }


