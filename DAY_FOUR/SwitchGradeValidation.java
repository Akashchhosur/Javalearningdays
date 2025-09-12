class SwitchGradeValidation
{
	public static void main(String[] agrs)
	{
		char grade='1';
		switch(grade)
		{
			case 'A': System.out.println("Excelent");
				 break;

			case 'B': System.out.println("Good");
				break;

			case 'C': System.out.println("Need To Improve");
				 break;

			default:System.out.println("Invalid grade");
				
		}
		System.out.println("-----Outside of Switch---------");
				
	}
}