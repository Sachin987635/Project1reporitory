package Sunday1906;

public class Inheritancechild extends Inheritance{
	public void poly() {
		super.poly(1);
		System.out.println("Static Parent Polymorphism");
	}
	public void poly(int a) {
		System.out.println("Static Parent Polymorphism");
	}
	public void poly(int b,int c) {
		System.out.println("Static Parent Polymorphism");
	}
}
