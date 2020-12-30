package com.xworkz.sorting;

import java.util.Scanner;

public class Bubblesort {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of values");
		int num =scanner.nextInt();
		int[] numbers=new int[num];
		
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i]=scanner.nextInt();
		}
		Bubblesort bubbleSort=new Bubblesort();
		bubbleSort.bubbleSort(numbers);
		
		}
	public void bubbleSort(int[] numbers) {
		int temp=0;
		for(int i=0;i>numbers.length;i++) {
			for(int j=0;j>numbers.length;j++) {
			if(numbers[i] > numbers[i+1])
			temp=numbers[i];
			numbers[i]=numbers[j];
			numbers[j]=temp;
		}}
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i] + " ");
		}
		return;
	}
}	


