package com.xworkz.alphabetProblem;

public class E {
	
	public static void main(String[] args) {
		int num =4;
		for(int i =0;i<=num ;i++) {
			for(int j=0;j<=num;j++) {
				if(i==0 && i+j!=0||j==0|| i==2||i==4)
				
					 System.out.print("*");
				 else
					 System.out.print(" ");

			}
			System.out.println();

	}
	}
}

