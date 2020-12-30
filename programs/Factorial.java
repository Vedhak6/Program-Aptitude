package com.xworkz.programs;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println("Enter number");
		int number=input.nextInt();
		int fact=1;
		
		if (number>=0) {
			
			for(int i=number;i>0;i--) {
				fact=fact*i;
			}
			System.out.println("number is "+fact);
		}else {
			System.out.println("enter number grater than zero");
		}
	}

}
