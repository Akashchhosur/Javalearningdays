package com;

class ArrayDeclaration {
	public static void main(String[] args) {
		//Array Declaration
		int[] a;
		//Array creation
		a=new int[3];
		//printing array
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("------------");
		//Array Initialization
		a[0]=20;
		a[1]=10;
		a[2]=30;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("*******************");

		//Array declaration and Creation and Initialization

		double[] k = new double[2];
		k[1]=20.3;
		k[0]=30.2;
		System.out.println("Length Array :"+k.length);


	}
}
      