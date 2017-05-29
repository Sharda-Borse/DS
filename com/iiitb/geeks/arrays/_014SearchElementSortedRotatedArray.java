package com.iiitb.geeks.arrays;
import java.util.*;

/*
 * search element in sorted rotated array
 *  normal folw of execution  as if 
 * */

public class _014SearchElementSortedRotatedArray {
	
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
		int key=scan.nextInt();
		int index=findElement(array,0,array.length,key);
		if(index!=-1)
			System.out.println(key+ " found at location "+index);
		else
			System.out.println(key+ " is not found in given array");
		scan.close();
	}
	
	static int findElement(int array[],int low,int high,int key){
		if(array.length==1){
			if(array[low]==key)
				return low;
			else
				return -1;
		}
		if(high<low)
			return -1;
		int mid=low+(high-low)/2;
		if(array[mid]==key)
			return mid;
		// if array elements from array[l...mid ] are sorted then check for it 
		// after check for key element
		if(low<=mid&&array[low]<=array[mid]){
			// if key to be find is belongs to which subarray check it and call it 
			if(key>=array[low]&&key<=array[mid])
				return findElement(array, low, mid-1, key);
			else
				return findElement(array, mid+1, high, key);
		}
		// else if array elements from array[low.. mid ] is not sorted then array[mid.. high] must be in sorted
		if(key>=array[mid]&&key<=array[high])
			return findElement(array, mid+1, high, key);
		else 
			return findElement(array,low,mid-1, key);
	}
	
}
