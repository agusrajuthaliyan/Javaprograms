import java.io.*;

public class FileCreate2 {
    public static void main(String[] args) {
        try{
            FileOutputStream fis = new FileOutputStream("D:\\AgusJava\\genprgms\\FilesandPath\\newfile1.txt"); //Using FileStream Method
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
