package com.iiitb.geeks.arrays;
import java.util.*;

/*
 * search element in sorted rotated array
 * 
 * */

public class _015SearchElementSortedRotatedArray {
	
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
		int key=scan.nextInt();
		
		
		int index=findElement(array, key);
		if(index!=-1)
			System.out.println(key+ " found at location "+index);
		else
			System.out.println(key+ " is not found in given array");
		
		scan.close();
	}
	
	static int findElement(int array[],int key){
		int pivotIndex=findPivot(array, 0, array.length-1);
		
		// aray is not rotated
		if(pivotIndex==-1)
			return binarySearch(array, 0, array.length-1, key);
		if(array[pivotIndex]==key)
			return pivotIndex;
		else if(array[pivotIndex]<=key)
			return binarySearch(array, 0, pivotIndex-1, key);
		else
			return binarySearch(array, pivotIndex+1, array.length-1, key);
	}
	static int binarySearch(int array[],int low,int high,int key){
		if(high<low)
			return -1;
		int mid=low+(high-low)/2;
		if(key==array[mid])
			return  mid;
		else if(key<array[mid])
			return binarySearch(array, low,mid-1, key);
		else
			return binarySearch(array, mid+1, high, key);
	}
	
	//  4 5 1 2 3 here pivot index is 2
	// sequence is like 1 2 3 4 5 index shuld be  4
	static int findPivot(int array[],int low,int high){
		if(high<low)
			return -1;
		if(high==low)
			return low;
		int mid=low+(high-low)/2;
		if(mid<high&& array[mid]>array[mid+1])
			return mid;
		if(low<mid&&array[mid]<array[mid-1])
			return mid-1;
		if(array[low]>=array[mid])
			return findPivot(array, low, mid-1);
		else
			return findPivot(array, mid+1, high);
	}
}
