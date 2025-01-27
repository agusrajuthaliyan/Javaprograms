import java.io.*;
public class WriteToFile {
    public static void main(String[] args) {
        try {
            // FileWriter fileWriter = new FileWriter("output.txt");
            FileOutputStream f = new FileOutputStream("NewText.txt");
            System.out.println("Enter the text to write, press # to STOP!");
            DataInputStream dis = new DataInputStream(System.in);
            String str = dis.readLine();
            while(true)
            {
                if(str.equals("#")){break;}
                f.write(str.getBytes());
                str = dis.readLine();
                f.write("\r\n".getBytes());

            }
             }
    catch(IOException e){
        System.out.println(e);
    }
}
}
