import java.io.*;
class findelem
{
	public static void main(String args[])
	{
		int n, a[],elem,found=0;
		try
		{
			System.out.println("Enter the size of array: ");
			DataInputStream dis = new DataInputStream(System.in);
			n = Integer.parseInt(dis.readLine());
			a = new int[n];
			for(int i=0;i<n;i++)
			{
				System.out.print("Enter the arr["+i+"] ");
				a[i] = Integer.parseInt(dis.readLine());
			}
			System.out.print("Enter the element to search: ");
			elem = Integer.parseInt(dis.readLine());
			for(int i =0;i<n;i++)
			{
				if(a[i]==elem)
				{
					found=1;
					System.out.println("Element "+elem+" is found at "+(i+1));
				}
			}
			if(found == 0)
			{
			System.out.println("Not found !");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}