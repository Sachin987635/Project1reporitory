package pkg2;

public class Child1 extends Parentclass{
	public void m3() {
		System.out.println("This is Child One");
	}
	public static void main(String[] args) {
		System.out.println("This is Multilevel Inheritance");
		
		Child1 obj=new Child1();
		obj.m1();
		obj.m2();
		obj.m3();
		
	}
}
