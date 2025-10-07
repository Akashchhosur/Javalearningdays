package com;

class Car {
	//constructor creation non-parameterized custom constructor.
	Car(){
		System.out.println("In Car");
	}
	public static void main(String[] args) {
		System.out.println("Start");
		
		Car c=new Car();//constructor call
		
		System.out.println("End");
	}

}
