import java.io.*;
public class swapvars
{
	public static void main(String args[])
	{
		int a,b;
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.print("Enter a: ");
			a = Integer.parseInt(dis.readLine());
			System.out.print("Enter b: ");
			b = Integer.parseInt(dis.readLine());
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("New A is "+a+" and New B is "+b+" is ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}