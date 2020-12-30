package com.xworkz.alphabetProblem;

public class J {

	public static void main(String[] args) {
	int num =4;
	
	for(int i =0;i<=num ;i++) {
		for(int j=0;j<=num;j++) {
			if(i==0 || j==4 && i!=4 || j==2 && i==4 || i==3 && i+j==3 )
			
				 System.out.print("*");
			 else
				 System.out.print(" ");

		}
		System.out.println();

}
}
}
