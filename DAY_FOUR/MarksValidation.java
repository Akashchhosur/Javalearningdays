class MarksValidation
{
	public static void main(String[] args)
	{
		int marks=99;
		if(marks>=0 && marks<=35)
		{
			System.out.println("Fail");
		}
		else if(marks>=36 && marks<=70)
		{
			System.out.println("good");
		}
		else if(marks>=71 && marks<=100)  
		{
			System.out.println("Excelent");
		}
		else
		{
			System.out.println("Invalid Marks");
		}
	}
}