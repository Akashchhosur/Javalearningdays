package com;

class Pen {
	//non static variables
	int cost=20;
	public static void main(String[] args) {
		Pen p1=new Pen();
		Pen p2=new Pen();
		System.out.println(p1.cost +" "+p2.cost);
		p1.cost=500;
		System.out.println(p1.cost+" "+p2.cost);
		p2.cost=454;
		System.out.println(p1.cost+" "+p2.cost);
	}

}
