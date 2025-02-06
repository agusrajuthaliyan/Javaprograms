import java.io.*;

class DESerializeDemo
{
    public static void main(String[] args)
    {
        try
        {
            Student s = null;
            FileInputStream fis = new FileInputStream("stud.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s=(Student)ois.readObject();
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