class Unary
{
	public static void main(String [] args)
	{
		//post increment >> first Assign,Then increment
		int a=10;
		int b=a++;
		System.out.println(a+" "+b); //11 10
		System.out.println(".....");

		//pre increment >> first increment,Then Assign
		int l=20;
		int m=++l;
		System.out.println(l+" "+m); //21 21
		System.out.println(".....");

		//post decrement >> first decrement,Then Assign
		int d=20;
		int f=d--;
		System.out.println(d+" "+b); //19 20
		System.out.println(".....");

		//pre decrement  >> first Assign,Then decrement		
		int h=50;
		int k=--h; //
		System.out.println(h+" "+k); //49 49
		System.out.println(".....");


	}

}