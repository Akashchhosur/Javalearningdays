package com;

class second {
	static int age;
	static String name;
	static void dis() {
		for(int i=-50;i<=0;i++) {
			System.out.println(i);
			
		}
		
	}
	public static void main(String[] args) {
		second sc=new second();
		sc.age=20;
		sc.name="Akash";
		System.out.println(age+" "+name);
		dis();
	}

}
