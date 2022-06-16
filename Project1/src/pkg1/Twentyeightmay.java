package pkg1;

public class Twentyeightmay {
	public void m1(){
		System.out.println("Default method");
	}
	public void m2(int a){
		System.out.println("1 Parameterized method");
	}
	public void m3(int a,int b){
		System.out.println("2 Parameterized method");
	}
	public void m4(int a,int b,int c){
		System.out.println("3 Parameterized method");
		this.m1();
		this.m2(10);
		this.m3(10,20);
		this.m5(10,20,30,40);
		
	}
	public void m5(int a,int b,int c,int d){
		System.out.println("4 Parameterized method");
	}
	public static void main(String[] args) {
		Twentyeightmay obj=new Twentyeightmay();
		obj.m4(10,20,30);
	}
}
