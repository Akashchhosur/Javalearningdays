package Initialization;

class Countrymain {
	public static void main(String[] args) {
		Country c1=new Country("India",130);
		Country c2=new Country("Japan",50);
		Country c3=new Country("China",140);
		System.out.println("Population of "+c1.name+" is "+c1.population+" crores");
		System.out.println("Population of "+c2.name+" is "+c2.population+" crores");
		System.out.println("Population of "+c3.name+" is "+c3.population+" crores");
	}

}
