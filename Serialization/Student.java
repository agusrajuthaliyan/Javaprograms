import java.io.*;

public class Student implements Serializable
{
    public String name;
    public String roll;
    public int age;
    
    public Student(String name, String roll, int age)
    {
        this.name=name;
        this.roll = roll;
        this.age=age;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(roll);
        System.out.println(age);
    }
}