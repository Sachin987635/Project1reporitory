package Sunday1906;

public class Sabsechota extends Inheritancechild{
	public void poly() {
		super.poly();
		System.out.println("Static Polymorphism");
	}
	public void poly(int a) {
		System.out.println("Static Polymorphism");
	}
	public void poly(int b,int c) {
		System.out.println("Static Polymorphism");
	}
	public static void main(String[] args) {
		Sabsechota obj=new Sabsechota ();
		obj.poly();
		
	}
	
}
