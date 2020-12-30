package com.xworkz.alphabetProblem;

public class K {

	public static void main(String[] args) {
		int num =4;
		
		for(int i =0;i<=num ;i++) {
			for(int j=0;j<=num;j++) {
				if( j==0 || i==2 && i+j<5 || i==j && i+j>2|| i==1 && i+j==4||i==0 && i+j==4 )
				
					 System.out.print("*");
				 else
					 System.out.print(" ");

			}
			System.out.println();

	}
	}
	
}
