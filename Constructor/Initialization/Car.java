package Initialization;

class Car {
	int cost;
	Car(int cost){
		this.cost=cost;
	}
	void dis()
	{
		System.out.println(cost+" lacks");
	}
	public static void main(String[] args) {
		Car c1=new Car(20);
		Car c2=new Car(23);
		System.out.println(c1.cost+" lacks");
		System.out.println(c2.cost+" lacks");
		c1.dis();
		c2.dis();

	}

}
