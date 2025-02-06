import java.io.*;

class DESerializePT
{
    public static void main(String[] args)
    {
        try
        {
            PartTime p = null;
            FileInputStream fis = new FileInputStream("PTstud.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s=(PartTimeStud)ois.readObject();
            s.disp();
            fis.close();
            ois.close();
            System.out.println("De Serialized!!");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}