import java.io.*;
public class circlearea
{
	public static void main(String args[])
	{
		double PIE = 3.14,area,r;
		try
		{
			DataInputStream dis = new DataInputStream(System.in);
			System.out.println("Enter the radius of circle: ");
			r = Double.parseDouble(dis.readLine());
			area = PIE * r*r;
			System.out.println("Area is: "+area);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}