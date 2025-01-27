import java.io.*;
public class FWrite{
    public static void main(String[] args) {
        try {
            File f = new File("N.txt");
            f.createNewFile();
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
