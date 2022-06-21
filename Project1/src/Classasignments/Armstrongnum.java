package Classasignments;

import java.util.Scanner;

public class Armstrongnum {
	public static void main(String[] args) {
		System.out.println("Please Enter a Number : ");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int oldnum=num;
		int sum=0;
		while (num>0) {
		int r = num%10;
		sum=sum+r*r*r;
		num=num/10;
		}
		if (sum==oldnum) {
			System.out.println("Its an armstrong Number : " + oldnum);
		}
		else {
			System.out.println("Its not Armstromng Number : "+oldnum);
		}
	}
}
