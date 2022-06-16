package pkg0506;

public class Automation {
  public Automation() {
	  this(1,2,3);
	System.out.println("Parent Default Constructor");
}
  public Automation(int a) {
	  this();
	System.out.println("Parent 1 Parameterized Constructor");
}
  public Automation(int a ,int b) {
	  this(1);
	System.out.println("Parent 2 Parametrized Constructor");
}
  public Automation(int a,int b,int c) {
	System.out.println("Parent 3 Parameterized Constructor");
}
}
