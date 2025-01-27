import java.io.*;
public class NestedDir
{
    public static void main(String[] args) {
        try {
            File f = new File("D:\\AgusJava\\genprgms\\FilesandPath\\A/AA/AAA");
            f.mkdirs();
            if(f.exists())
            {
                System.out.print("Name: "+f.getName());
                System.out.print("\nPath: "+f.getAbsolutePath());
                System.out.print("\n"+f.getCanonicalPath());
                System.out.print("\nSize: "+f.length());
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
}
}
