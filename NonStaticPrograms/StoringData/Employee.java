package StoringData;

class Employee {
	int id;
	String name;
	double sal;
	public static void main(String[] args) {
		Employee em1=new Employee();
		em1.id=1;
		em1.name="Akash";
		em1.sal=20000.000;
		System.out.println("id  :"+em1.id+" Name :"+em1.name+" sal :"+em1.sal);
		Employee em2=new Employee();
		em2.id=2;
		em2.name="Vaikunt";
		em2.sal=3000.000;
		System.out.println("id  :"+em2.id+" Name :"+em2.name+" sal :0"+em2.sal);



	}
}

