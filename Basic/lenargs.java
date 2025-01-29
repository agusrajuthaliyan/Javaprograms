class lenargs
{
	public static void main(String args[])
	{
		int count,i=0;
		count = args.length;
		System.out.println("No. of Args is: "+count);
		while(i<count)
		{
			String str = args[i];
			System.out.println("Argument is: " +str);
			i++;
		}
	}
}