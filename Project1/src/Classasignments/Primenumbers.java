package Classasignments;

import java.util.Scanner;

public class Primenumbers {
	public static void main(String[] args) {
		System.out.print("Please Enter a Number : ");
		Scanner s=new Scanner(System.in);
		int num = s.nextInt();
		int half=num/2;
		int sachin=0;
		for (int i=2;i<=half;i++) {
			if (half%i==0) {
				System.out.println("It Not a Prime Number : "+ num);
				sachin=1;
				break;
			}
		}
		if(sachin==0) {
			System.out.println("Its a Prime Number : "+num);
		}
	}
	
}
