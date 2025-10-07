package com;

class Varibles {
	int a=90;
	void dis() {
		int a=230;
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		Varibles v =new Varibles();
		v.dis();
		
	}

}
