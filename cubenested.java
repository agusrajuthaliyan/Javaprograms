import java.io.*;
class test
{
	int cube(int a)
	{
		int cube = a*sqr(a);
		return cube;
	}
	int sqr(int a)
	{
		int s = a*a;
		return s;
	}
}
public class cubenested
{
	public static void main(String args[])
	{
		int a;
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.print("Enter a: ");
			a = Integer.parseInt(dis.readLine());
			test t = new test();
			int cube = t.cube(a);
			System.out.println("Cube is: "+cube);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}