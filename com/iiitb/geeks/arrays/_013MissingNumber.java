package com.iiitb.geeks.arrays;
import java.util.*;


public class _013MissingNumber {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n-1;i++)
			array[i]=scan.nextInt();
		printMissingNumber(array);
		
		scan.close();
	}
	static void printMissingNumber(int array[]){
		int n=array.length;
		int total_Sum=n*(n+1)/2;
		for(int i=0;i<array.length;i++)
			total_Sum-=array[i];
		System.out.println("Missing number is "+total_Sum);
		
	}
}
