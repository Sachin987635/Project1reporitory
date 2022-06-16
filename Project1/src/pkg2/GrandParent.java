package pkg2;

public class GrandParent {
	public void m1() {
		System.out.println("This is Grand Parent");
	}
	public static void main(String[] args) {
		Child2 obj=new Child2();
		obj.m4();
	}
}
