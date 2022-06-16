package pkg1;
import java.util.Scanner;

public class Twentyeightmayas3 {
	public int sum(int x,int y) {
		int sumres = x+y;
		return(sumres);
	}
	public int sub(int x,int y) {
		int subres = x-y;
		return(subres);
	}
	public int multi(int x,int y) {
		int multires = x*y;
		return(multires);
	}
	public int divide(int x,int y) {
		int divideres = x/y;
		return(divideres);
	}
	public static void main(String[] args) {
		Scanner scannerobj=new Scanner(System.in);
		
		System.out.println("please enter first value for x1 : ");
		int x1=scannerobj.nextInt();
		System.out.println("please enter Second value for x2 : ");
		int x2=scannerobj.nextInt();
		Twentyeightmayas3 obj=new Twentyeightmayas3();
		int result=obj.multi(x1, x2);
		System.out.println("(x1*x2) = "+ result);
		System.out.println("please enter first value for x3 : ");
		int x3=scannerobj.nextInt();
		result=obj.sub(result, x3);
		System.out.println("((x1*x2)-x3) = "+ result);
		System.out.println("please enter first value for x4 : ");
		int x4=scannerobj.nextInt();
		result = obj.multi(result, x4);
		System.out.println("(((x1*x2)-x3)*x4) = "+ result);
		System.out.println("please enter first value for x5 : ");
		int x5=scannerobj.nextInt();
		result = obj.sum(result, x5);
		System.out.println("((((x1*x2)-x3)*x4)+x5) = "+ result);
		System.out.println("please enter first value for x5 : ");
		int x6=scannerobj.nextInt();
		result = obj.divide(result, x6);
		System.out.println("Final Result (((((x1*x2)-x3)*x4)+x5)/x6) = "+ result);
	}
}
