import java.io.*;

class SerializeDemo
{
    public static void main(String[] args)
    {
        try
        {
            Student s1 = new Student("Agus","MSCCS",22);
            FileOutputStream fos = new FileOutputStream("stud.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);
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