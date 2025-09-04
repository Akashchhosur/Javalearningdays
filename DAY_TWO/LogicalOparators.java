class LogicalOparators
{
	public static void main(String [] agrs)
	
	{
		int a=5;
		int b=10;
		System.out.println(a<b && a==b); //false
		System.out.println(a<b && a==5); //true

		System.out.println(a<b || a==b); //true
		System.out.println(a>b || a==b); //false

		System.out.println(!false); //true
		System.out.println(!true); //false

		System.out.println(!(a==b)); //true
		System.out.println(!(a<b)); //false

	}
}