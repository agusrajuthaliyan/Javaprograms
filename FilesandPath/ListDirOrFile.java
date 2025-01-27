import java.io.*;
public class ListDirOrFile
{
    public static void main(String[] args) {
        try {
            File f = new File("D:\\AgusJava\\genprgms\\FilesandPath");
            String a[] = f.list();
            
            for(int i = 0;i<a.length;i++)
            {
                File fi = new File("D:\\AgusJava\\genprgms\\FilesandPath/"+a[i]);
                System.out.println(a[i]);
                if(fi.isDirectory())
                {
                    System.out.println(fi+" is a Directory!");;
                }
                else if(fi.isFile())
                {
                    System.out.println(fi+" is a File!");
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
}
}
