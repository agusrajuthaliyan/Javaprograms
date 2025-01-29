import java.io.*;
class sortarray
{
	public static void main(String args[])
	{
		int n, a[];
		try
		{
			System.out.print("Enter the size of array: ");
			DataInputStream dis = new DataInputStream(System.in);
			n = Integer.parseInt(dis.readLine());
			a = new int[n];
			for(int i=0;i<n;i++)
			{
				System.out.print("Enter the arr["+i+"] ");
				a[i] = Integer.parseInt(dis.readLine());
			}
			for(int i=0;i<n;i++)
			{
				for(int j=i;j<n-i-1;j++)
				{
					if(a[j]>a[j+1])
					{
						int temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					}
				}
			}
			for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+",");
			}			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}