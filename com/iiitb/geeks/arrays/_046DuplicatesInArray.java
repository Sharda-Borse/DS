package com.iiitb.geeks.arrays;

import java.util.Scanner;

public class _046DuplicatesInArray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		printDuplicates(array);
		
		scan.close();
	}
	//7 	1 2 3 1 3 6 6
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}	
	static void printDuplicates(int array[]){
		for(int i=0;i<array.length;i++){
			if(array[Math.abs(array[i])]>0)
				array[Math.abs(array[i])]=-array[Math.abs(array[i])];
			else
				System.out.print(Math.abs(array[i])+" ");
		}
	}
}
