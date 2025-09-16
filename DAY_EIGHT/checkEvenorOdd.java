package com;

class checkEvenorOdd {
	static void check(int num)
	{
		if(num%2==0)
		{
			System.out.println(num+" is a Even Number...!");
		}else {
			System.out.println(num+" is a Odd Number.....! ");
		}
	}
	public static void main(String[] args) {
		check(21);
	}

}
