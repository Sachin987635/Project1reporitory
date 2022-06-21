package Classasignments;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		System.out.print("Please Enter a number");
		Scanner s = new Scanner(System.in);
		int num=s.nextInt();
		int sum=0;
		int oldnum=num;
		while(num>0) {
		 int r =num%10;
		 sum = sum*10+r;
		 num = num/10;
		}
		if (sum==oldnum) {
			System.out.println("Its a Palindrome : " + oldnum);
		}
		else {
			System.out.println("Its not a Palindrome : "+ oldnum);
		}
	}
}
