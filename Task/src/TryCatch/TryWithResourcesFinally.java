package TryCatch;

import java.io.FileOutputStream;

public class TryWithResourcesFinally {
    public static void main(String[] args) {
        try(FileOutputStream fileOutputStream=new FileOutputStream("abc.txt")) {
            String msg = "Exception";
            byte byteArray[] = msg.getBytes();
            fileOutputStream.write(byteArray);
            System.out.println("file is successfuly writen");
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Excecuting finally Successfully");
        }
        System.out.println("running Try With Resources");
    }
}
