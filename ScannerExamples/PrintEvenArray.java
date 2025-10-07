package com;

class PrintEvenArray {
	public static void main(String[] args) {
		int a[]= {4,25,9,12,16,23,45};
		for (int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
				
		}
		System.out.println("Odd Numbers");
		for (int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {//if(a[i]==1)
				System.out.println(a[i]);
			}
				
		}

	}

}
