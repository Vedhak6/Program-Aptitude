package com.xworkz.alphabetProblem;

public class M {
	
public static void main(String[] args) {
		
		int num=4;
		for(int i =0;i<=num ;i++) {
			for(int j=0;j<=num;j++) {
				 if(j==0 || j==4||i==j && i+j<6||i+j==4 && i==1 || i+j==4 && i==0 ) {
					 System.out.print("*");
					  }
					else
					System.out.print(" ");

	}
			System.out.println();

	}

}

	

}
