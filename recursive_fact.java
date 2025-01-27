import java.io.*;
class test
{
	int fact(int n)
	{
		if(n>=1)
		{
			int fact = n*fact(n-1);
			return fact;
		}
		else
			return 1;
	}
}
public class recursive_fact
{
	public static void main(String args[])
	{
		int n;
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.print("Enter n: ");
			n = Integer.parseInt(dis.readLine());
			test t = new test();
			int f = t.fact(n);
			System.out.println("Fact is: "+f);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}