import java.io.*;
class strfunc
{
	public static void main(String args[])
	{
		try
		{
            String str1 = "Hello, World!";
            String str2 = "Hello, Java!";
			System.out.println("The length of str1 is: " + str1.length());
		}
		catch(Exception e)
		{
            System.out.println(e);
        }
	}
}
