package com.xworkz.alphabetProblem;

public class O {

	
	public static void main(String[] args) {
		
		int num=4;
		for(int i=0;i<=num;i++) {
			for(int j=0;j<=num;j++) {
			
				if(j==0 && i!=4 && i!=j || i==0 && j!=4 && i!=j || j==4  && i!=0 && i!=j || i==4 && i+j!=4 && i+j!=8) 
				System.out.print("*");
				
				else 
				System.out.print(" ");	
				
			}
			System.out.println();
		}
	}

}
