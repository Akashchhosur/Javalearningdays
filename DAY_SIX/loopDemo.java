class loopDemo
{
	public static void main(String[] args)
	{
		//for loop
		for(int i=1;i<=9;i+=2)
		{
			System.out.println(i);
			
		}
		
		System.out.println("-------------------");
		//While loop
		int n=1;
		while(n<=9)
		{
			System.out.println(n);
			n+=2;
		}
		System.out.println("-------------------");

		//DoWhile
		int i=1;
		do
		{
			System.out.println(i);
			i+=2;	
		}
		while(i<=9);
	}
}