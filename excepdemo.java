import java.io.*;
class excepdemo
{
	public static void main(String args[])
	{
		try
		{
			double d = 100;
			double c = 25;
			double a = d/c;
			if(a < 5.0)
			{
				throw new ShijoyException("Oops.. Don't do it!!!");
			}
			else
			{
				System.out.println("Perfect, No Exceptions!");
			}
		}
		catch(ShijoyException e)
		{
			System.out.println("Caught ShijoyException");
			System.out.println(e);
		}
	}
}
class ShijoyException extends Exception
{
	ShijoyException(String mess)
	{
		super(mess);
	}
}
