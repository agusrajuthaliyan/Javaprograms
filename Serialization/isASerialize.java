import java.io.*;

class isASerialize
{
    public static void main(String[] args)
    {
        try
        {
            PartTimeStud p = new PartTimeStud("Agus","MSCCS01",22,"wknd");
            FileOutputStream fos = new FileOutputStream("PTstud.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(p);
            fos.close();
            oos.close();
            System.out.println("This is Serialization!");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}