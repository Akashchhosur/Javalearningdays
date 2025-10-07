package com;

class ReversseArray {
	public static void main(String[] args) {
		String names[]= {"tom","jerry","John"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println("  ");
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("  ");
		for(int i=names.length-1;i>=0;i--) {
			System.out.println(names[i]);
		}
	}

}
