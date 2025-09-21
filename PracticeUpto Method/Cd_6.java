package com;
import java.util.Scanner;
class Cd_6 {
	public static void main(String[] args) {
		int num=50;
		System.out.println("Enter a Number :");
		Scanner sc =new Scanner(System.in);
		int userNum=sc.nextInt();
		if (num>userNum) {
			System.out.println("Num is Greater Then User Number...!!!");
		}else {
			System.out.println("Num is leserThen User Number...!!!");

		}
	}

}
