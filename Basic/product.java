import java.io.*;
public class product
{
	public static void main(String args[])
	{
		int p,a,b;
		try
		{
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			p = a*b;
			System.out.println("Product is: "+p);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}