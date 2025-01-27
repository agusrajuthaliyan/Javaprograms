import java.io.*;
public class FileCreate1{
    public static void main(String[] args) {
        try{
            File f = new File("D:\\AgusJava\\genprgms\\FilesandPath\\newfile.txt");
            boolean fc = f.createNewFile();
            if(fc)
                {System.out.println("File created !");}
            else
                {System.out.println("File Not Created !!");}
        }
        catch(IOException e)
        {System.out.println(e);}
    }
}