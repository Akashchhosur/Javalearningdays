package com;

class Caclulater {
	static int Add() {
		return 20+50;
	}
	static int Mul(int p,int m) {
		return p*m;
	}
	public static void main(String[] args) {
		int v=Add();
		System.out.println(v);
		System.out.println(Mul(20,30));
	}

}
