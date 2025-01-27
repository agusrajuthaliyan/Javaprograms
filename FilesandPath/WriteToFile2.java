import java.io.*;
public class WriteToFile2 {
    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("NewText2.txt");
            int b = f.read(); //read as bytes
            int ct = 0;
            while(b!=1)
            {
                char c =char(b);
                sop(c);
                b = f.read(); ct++;
            }
            f.close();
    catch(IOException e){
        System.out.println(e);
    }
}
}