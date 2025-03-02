import java.io.*;

class PartTimeStud extends Student
{
    public String category;
    public PartTimeStud(String name, String roll, int age, String category)
    {
        super(name, roll, age);
        this.category = category;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(roll);
        System.out.println(age);
        System.out.println(category);
    }
}