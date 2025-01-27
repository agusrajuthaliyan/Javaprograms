import java.io.*;
class RAF{
    public static void main(String[] args) {
        try {
            RandomAccessFile f = new RandomAccessFile("D:\\AgusJava//genprgms//FilesandPath//NewText.txt","r");
            f.seek(10);
            byte[] b = new byte[20];
            f.read(b);
            System.out.println(b);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
}
}