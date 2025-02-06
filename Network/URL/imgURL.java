import java.net.*;
import java.io.*;
public class imgURL {

    public static void main(String[] args) {
        try {
            URL u = new URL("https://static1.simpleflyingimages.com/wordpress/wp-content/uploads/2020/07/STS_Challenger_on_747_SCA-1000x791.jpg");
            BufferedReader br = new BufferedReader(new InputStreamReader(u.openStream()));
//          BufferedWriter out = new BufferedWriter(new FileOutputStream("img.pdf"));
            PrintWriter out = new PrintWriter(new FileWriter("img.pdf"));
            String str;
            while((str = br.readLine()) != null)
            {
                out.write(str);
            }
            br.close();
            out.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
