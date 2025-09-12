class NestedIfLogin
{
	public static void main(String[] agrs)
	{	
		String Email="AkashHosur";
		int Password=1704;
		if(Email=="AkashHosur")
		{
			System.out.println("Email is valid");
		
			if (Password==1705)
			{
				System.out.println("Password is valid");
				System.out.println("Login succesfull");
			}
			else
			{
				System.out.println("Password Invalid");
				System.out.println("Login Unsuccesfull Try Again");
				
			}
		}
		else
		{
			System.out.println("Email is Invalid");
			System.out.println("Login Unsuccesfull Try Again");
		}

	}
}