package com.xworkz.patternproblems;

public class LeftAngle {

	public static void main(String[] args) {
		
		int num=4;
		for (int i=0;i<=num;i++){
			for(int j=0;j<=num;j++) {
				if(i+j>=num)
				System.out.print("*");
			else 
					System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("---------------");
		
		for (int i=0;i<=num;i++){
			for(int j=0;j<=num;j++) {
				if(i==j || i==0 || j==4)
				System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}
		
		
	System.out.println("------------------");

	for (int i=0;i<=num;i++){
		for(int j=0;j<=num;j++) {
			if(i==4||j==4||i+j==4)
			System.out.print("*");
			else 
				System.out.print(" ");
		}
		System.out.println();
	}
	


	}

}
