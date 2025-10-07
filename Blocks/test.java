package com;

class test{
	
	static {
		System.out.println(1);
	}
	
	{
		System.out.println(2);
	}
	
	{
		System.out.println(3);
	}
	public static void main(String[] args) {
		System.out.println("Start");
		new test();
		test t =new test();
		System.out.println("End");
	}

}
