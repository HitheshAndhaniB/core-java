package Programs;

public class RemoveSpecial {
    public static void main(String[] args)
    {
        String str="Pr!ogr#am%m*in&g Lan?#guag(e";
        //String Str1="";
        for (int i=0;i<str.length();i++)
        {
            //if (str.charAt(i)>64 && str.charAt(i)<=122 || str.charAt(i)==32 )
            if(Character.isLetterOrDigit(str.charAt(i))||Character.isWhitespace(str.charAt(i)))
            {
                //Str1=Str1+str.charAt(i);
                System.out.print(str.charAt(i));

            }
        }
      //  System.out.println("String after removing special characters: "+Str1);
    }
}
