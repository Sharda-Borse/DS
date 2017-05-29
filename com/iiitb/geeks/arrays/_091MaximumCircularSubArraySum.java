package com.iiitb.geeks.arrays;

import java.util.Scanner;

public class _091MaximumCircularSubArraySum {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			printArray(array, n);
				
		}
	}
	static void printArray(int array[],int n){
		for(int i=0;i<n;i++)
			System.out.print(array[i]);
		System.out.println();
	}
}
