package pkg1;

public class Student {
	int rollno;
	int age;
	public void display1() {
		System.out.println("This is the First Message");
	}
	public void display2() {
		System.out.println("This is the Second Message");
	}
	public static void main(String[] args) {
		Student deepak=new Student();
		deepak.rollno=10;
		deepak.age=23;
		deepak.display1();
		deepak.display2();
		System.out.println(deepak.rollno);
		System.out.println(deepak.age);
		
	}
}
