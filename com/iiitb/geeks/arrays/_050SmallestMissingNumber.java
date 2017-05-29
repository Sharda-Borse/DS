package com.iiitb.geeks.arrays;

import java.util.Scanner;
/*
 * smallest missing number as it already said that elements range will be from 0 to m-1
 * so index locations will conatain respective element
 * size of m does not matter
 * tc o(logn)
 * */
public class _050SmallestMissingNumber {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		System.out.println("smallestt mising number "+printSmallestMisingNumber(array, 0, n-1));
		scan.close();
	}

	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	static int printSmallestMisingNumber(int array[],int low,int high){
		if(low>high)
			return high+1;
		if(low!=array[low])
			return low;
		int mid=low+(high-low)/2;
		if(mid==array[mid])
			return printSmallestMisingNumber(array, mid+1, high);
		return printSmallestMisingNumber(array, low, mid);
	}
}
