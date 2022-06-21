package Classasignments;

public class Swappingusingthirdvariable {
	public void m1(){
		int a =10;
		int b = 15;
		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		int c=0;
		c=a;
		a=b;
		b=c;
		
		System.out.println("After Swapping");
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Swappingusingthirdvariable obj=new Swappingusingthirdvariable();
		obj.m1();
	}
}
