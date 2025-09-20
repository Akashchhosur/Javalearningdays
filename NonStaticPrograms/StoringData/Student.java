package StoringData;

class Student {
	String name;
	int Marks;
	public static void main(String[] args) {
		//Student one 
		Student s1=new Student();
		s1.name="Akash";
		s1.Marks=50;
		System.out.println(s1.name+" has scored "+s1.Marks+" marks");
		//Student Two
		Student s2=new Student();
		s2.name="Vaikunt";
		s2.Marks=100;

		System.out.println(s2.name+" has scored "+s2.Marks+" marks");


	}
}
