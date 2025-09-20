package com;

class Student {
	//Static variables
	static int age=23;
	//Static method
	static void study() {
		System.out.println("Studying java!!!!");
	}
	public static void main(String[] args) {
		//using classname or withoout classname
		System.out.println("Age of Student is :"+Student.age);
		Student.study();
		System.out.println("-----------------------");
		System.out.println("Age of Student is :"+age);
		study();

	}

}
