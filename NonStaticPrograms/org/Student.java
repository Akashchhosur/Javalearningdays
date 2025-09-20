package org;

class Student {
	//non static variables
	int marks=100;
	//non static methods
	void study(){
		System.out.println("Studying java");
	}
	public static void main(String[] args) {
		Student std=new Student();
		System.out.println(std.marks);//accesing of non static variables
		std.study();//accesing of non static method
	}

}
