package com.xworkz.Test;

public class Pattern2 {

	public static void main(String[] args) {
		
		int num=4;
		int mid=num/2;
		for(int i =0;i<=num ;i++) {
			for(int j=0;j<=num;j++) {
				 if((i+j==mid || j-i==mid)) {
					 System.out.print(i);
				 }
				 else if( (i-j==mid||i+j==num+mid)) {
					 System.out.print(i);
					  
					  }
					else
					System.out.print(" ");

	}
			System.out.println();

	}


	}

}
