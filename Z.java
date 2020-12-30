package com.xworkz.alphabetProblem;

public class Z {
	
public static void main(String[] args) {
		
		int num=4;
		for(int i =0;i<=num ;i++) {
			for(int j=0;j<=num;j++) {
				 if(i==0||i==4 || i+j==4 && i==2|| i+j==4 && i==1 || i+j==4 && j==1 ) {
					 System.out.print("*");
					  }
					else
					System.out.print(" ");

	}
			System.out.println();

	}

}


}
