package com.iiitb.geeks.arrays;
import java.util.*;

/*
 * tc is o(n) using xor method
 * */
public class _012MissingNumber {
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
		int res=0;
		for(int i=1;i<=array.length;i++)
			res^=i;
		for(int i=0;i<array.length;i++)
			res^=array[i];
		
		System.out.println("Missing number is "+res);
		
	}
}
