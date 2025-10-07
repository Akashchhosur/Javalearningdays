package com;

class NonStaticBlocks {


	{
		System.out.println("In Non static blocks-1");
	}

	public static void main(String[] args) {
		System.out.println("Start");
		NonStaticBlocks d =new NonStaticBlocks();
		NonStaticBlocks d1 =new NonStaticBlocks();
		System.out.println("End");
	}


	{
		System.out.println("In Non static blocks-2");
	}

}
