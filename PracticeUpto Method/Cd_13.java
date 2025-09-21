package com;

class Cd_13 {
	static int fib(int n) {
		if(n==1) {
			return 0;
		}else if(n==2) {
			return 1;
		}else {
			return fib(n-1)+fib(n-2);
		}
	}
	public static void main(String[] args) {
		System.out.println(fib(5));
		int fibb=0;
		for(int i=0;i<5;i++) {
			fibb=i+(i+1);
			System.out.println(fibb);
		}
	}

}
