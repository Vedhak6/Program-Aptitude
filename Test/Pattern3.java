package com.xworkz.Test;

public class Pattern3 {

	public static void main(String[] args) {
		 
		int num=5;
		for(int i=0;i<=num;i++) {
			for(int j=0;j<=num;j++) {
				
				if(j==0 && i!=5 && i!=j || i==0 && j!=5 && i!=j || j==5  && i!=0 && i!=j || i==5 && i+j!=5 && i+j!=10) 
					System.out.print(i+j);
				
				else 
				System.out.print(" ");	
				
			}
			System.out.println();
		}

	}

}
