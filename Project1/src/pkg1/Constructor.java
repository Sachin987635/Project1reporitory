package pkg1;

public class Constructor {
	public Constructor(int a) {
		this(1,2);
	System.out.println("One Parameterized Constructor");
	}
	public Constructor(int a,int b) {
		this(1,2,3);
		System.out.println("Two Parameterized Constructor");
	}
	public Constructor(int a,int b,int c) {
		System.out.println("Three Parameterized Constructor");
	}
	public Constructor(int a,int b,int c,int d) {
		this(1);
		System.out.println("Four Parameterized Constructor");
	}
	public static void main(String[] args) {
		Constructor obj1=new Constructor(10,20,30,40);
	}
}
