package com.xworkz.alphabetProblem;

public class N {
	
	public static void main(String[] args) {
		
		int num=4;
		for(int i=0;i<=num;i++) {
			for(int j=0;j<=num;j++) {
				
				if(j==0||j==4||i==j ) 
				System.out.print("*");
				
				else 
				System.out.print(" ");	
				
			}
			System.out.println();
		}
	}

	}

