package com.xworkz.alphabetProblem;

public class B {

	public static void main(String[] args) {
		
		int num =4;
		for(int i =0;i<=num ;i++) {
			for(int j=0;j<=num;j++) {
				 if(j==0  || i==2 && j!=4 || i==0 && j!=4 || i==4 && j!=4 || i+j>num && i<j && i!=2 )
					 System.out.print("*");
				 else
					 System.out.print(" ");

			}
			System.out.println();
		

	}

		
	}

}
