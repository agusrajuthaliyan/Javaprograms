import java.io.*;
public class maxnumofthree
{
	public static void main(String args[])
	{
		int a,b,c;
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.print("Enter a: ");
			a = Integer.parseInt(dis.readLine());
			System.out.print("Enter b: ");
			b = Integer.parseInt(dis.readLine());
			System.out.print("Enter c: ");
			c = Integer.parseInt(dis.readLine());
			int max = a>b?a:b;
			max = c>a?c:a;
			System.out.println("Max of 3 is: "+max);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}