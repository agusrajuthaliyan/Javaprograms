import java.net.*;
import java.io.*;
public class DownloadURL {

    public static void main(String[] args) {
        try {
            URL u = new URL("https://web-assets.bcg.com/ce/d8/c0f576bc42968d376aba70ce8136/unlocking-the-fintech-potential-in-africa.pdf");
            BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
            String str;
            while((str = br.readLine()) != null)
            {
                System.out.println(str);
            }
            br.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
