package pkg2;

public class Parentclass extends GrandParent{
   public void m2() {
	   System.out.println("This is Parent Class Method");
   }
   public static void main(String[] args) {
	Parentclass obj=new Parentclass();
	obj.m2();
	obj.m1();
}
}
