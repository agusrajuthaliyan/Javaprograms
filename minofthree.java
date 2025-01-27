import java.io.*;
public class minofthree
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
			int min = a<(min=b<c?b:c)?a:min;
			System.out.println("Min of 3 is: "+min);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}