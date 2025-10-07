package com;

class Person {
	int age;
	
	{
		age=20;
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("Age :"+p.age);
	}
	
	{
		age=35;
	}

}
