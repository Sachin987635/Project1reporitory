package pkg0506;

public class Selenium extends Automation{
	  public Selenium() {
		  super(1,2);
			System.out.println("Child Default Constructor");
		}
		  public Selenium(int a) {
			  this(1,2);
			System.out.println("Child 1 Parameterized Constructor");
		}
		  public Selenium(int a ,int b) {
			  this(1,2,3);
			System.out.println("Child 2 Parametrized Constructor");
		}
		  public Selenium(int a,int b,int c) {
			  this();
			System.out.println("Child 3 Parameterized Constructor");
		}
		public static void main(String[] args) {
			Selenium obj=new Selenium(1);
		}
}
