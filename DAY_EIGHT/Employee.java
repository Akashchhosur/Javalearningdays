package com;

class Employee {
	static void Employee(int id,String name) {
		System.out.println("id :"+id+" Name :"+name);
	}
	static double test() {
		return 6.666666666;
	}
	public static void main(String[] args) {
		Employee(1,"Akash");
		System.out.println(test());
	}

}
