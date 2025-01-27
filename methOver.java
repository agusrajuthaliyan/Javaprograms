import java.io.*;
class area
{
	void rectangle(int x, int y)
	{
		System.out.println("The area is  "+(x*y));
	}
	void rectangle(float x, float y)
	{
		System.out.println("The area is  "+(x*y));
	}
	void rectangle(int x, float y)
	{
		System.out.println("The area is  "+(x*y));
	}
	void rectangle(float x, int y)
	{
		System.out.println("The area is  "+(x*y));
	}
}

class methOver
{
	public static void main(String args[])
	{
		try
		{
			area a = new area();
			DataInputStream dis = new DataInputStream(System.in);
			System.out.print("Enter iLength: ");
			int il = Integer.parseInt(dis.readLine());
			System.out.print("Enter iBreadth: ");
			int ib = Integer.parseInt(dis.readLine());
			System.out.print("Enter fLength: ");
			float fl = Float.parseFloat(dis.readLine());
			System.out.print("Enter fBreadth: ");
			float fb = Float.parseFloat(dis.readLine());
			a.rectangle(il,ib);
			a.rectangle(il,fb);
			a.rectangle(fl,ib);
			a.rectangle(fl,fb);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}		