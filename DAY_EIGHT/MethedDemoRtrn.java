package com;

class MethedDemoRtrn {
	static int display() {
		return 120;
	}
	static double dbdisplay() {
		return 2.555;
	}
	public static void main(String[] args) {
		System.out.println("Start");
		int x=display();//int x=120
		System.out.println(x);
		//Or also we can print directly
		System.out.println(".......Direct print.......");
		System.out.println(display());
		System.out.println(dbdisplay());
		System.out.println("End");
	}

}
