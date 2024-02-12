package TryCatch;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TryWithResources {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream=new FileOutputStream("abc.txt")) {
            String msg = "Exception";
            byte byteArray[] = msg.getBytes();
            fileOutputStream.write(byteArray);
            System.out.println("file is successfuly writen");
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("running Try With Resources");
    }
}