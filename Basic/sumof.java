import java.io.*;
public class sumof
{
	public static void main(String args[])
	{
		int sum,a,b;
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.print("Enter a: ");
			a = Integer.parseInt(dis.readLine());
			System.out.print("Enter b: ");
			b = Integer.parseInt(dis.readLine());
			sum = a+b;
			System.out.println("Sum of "+a+" and "+b+" is "+sum);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}