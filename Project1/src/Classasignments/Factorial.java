package Classasignments;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter a Number : ");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int fact=1;
		for (int i=1;i<=num;i++) { //1,2,3,4,5,6
			fact=fact*i;//  1*1=1,2*1=2,2*3=6,6*4=24,24*5=120
		}
		System.out.println("Factorial Of a " + num + " Is : "+ fact);
	}

}
