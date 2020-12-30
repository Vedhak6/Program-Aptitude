package com.xworkz.programs;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=12,num1=11;
		int count=0;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
				break;
			}
		}

		if (count==0) {
			System.out.println("number is prime");
		}
			else {
				System.out.println(num+" : number is not prime");
		}
	}

}
