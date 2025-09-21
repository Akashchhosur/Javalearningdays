package com;

class Cd_12 {
	static int fact(int n) {
		
		if(n==0 || n==1) {
			return 1;
		}else {
			return   n*fact(n-1);
		}
		
		
		
		
	}
	public static void main(String[] args) {
		int n=7;
		int sum=1;
		System.out.println(fact(n)); 
		for(int i=1;i<6;i++) {
			sum=sum*i;
			System.out.println(sum);
		}
	}

}
