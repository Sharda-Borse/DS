package com.iiitb.geeks.arrays;

import java.util.*;

public class _060FixedPointElementArray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		
		printFixedPointLinearSearch(array);
		printFixedPointBinarySearch(array);
		scan.close();
	}


	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	static void printFixedPointLinearSearch(int array[]){
		for(int i=0;i<array.length;i++){
			if(array[i]==i)
				System.out.println(array[i]);
		}
	}
	static void printFixedPointBinarySearch(int array[]){
		int x=binarySearch(array,0,array.length-1);
		System.out.println(x);
		
			
	}
	static int binarySearch(int array[],int low,int high){
		if(low<=high){
			int mid=low+(high-low)/2;
			if(array[mid]==mid)
				return mid;
			else if(array[mid]<mid)
				return binarySearch(array,mid+1,high);
			else
				return binarySearch(array, low, mid-1);
		}
		return -1;
	}
}
