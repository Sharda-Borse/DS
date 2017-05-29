package com.iiitb.geeks.arrays;
import java.util.*;

import javax.naming.BinaryRefAddr;
/*
 * brute force approach tc o(n) iterate through array and count the occurances of given X if it is greater than n/2
 * second approach binary search
 * in binary search find the first occurance of element then check if the array[n/2+i] is same elment or not
 * 
 * */
public class _034MajorityElementSortedArray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		int x=scan.nextInt();
		if(majorityElement(array, x))
				System.out.println("Given element "+x+" is majority element in sorted array");
		else
				System.out.println("Given element "+x+" is not majority element");
		System.out.println("Binary Search approach");
		if(majorityBinarySearch(array, x))
			System.out.println("Given element "+x+" is majority element in sorted array");
		else
			System.out.println("Given element "+x+" is not majority element");
		
		
		scan.close();
	}
	// bruteforce approach
	static boolean majorityElement(int array[],int x){
		int i,last_index=0;
		last_index=(array.length%2==0)?(array.length/2):(array.length/2)+1;
		for(i=0;i<last_index;i++){
				if(array[i]==x&&array[i+array.length/2]==x)
					return true;
		}
		return false;
		
	}
	// binary serach approach tc o(log n)
	
	static int binarySearch(int array[],int low,int high,int key){
		if(low<=high){
			int mid=low+(high-low)/2;
			if((mid==0||key>array[mid-1])&&(array[mid]==key))
				return mid;
			else if(array[mid]<key)
				return binarySearch(array, mid+1, high, key);
			else
				return binarySearch(array, low, mid-1, key);
		}
		return -1;
	}
	static boolean majorityBinarySearch(int array[],int key){
		int i=binarySearch(array, 0, array.length-1, key);
		if(i==-1)
			return false;
		if(((i+array.length/2)<=array.length-1)&&array[i+array.length/2]==key)
			return true;
		else
			return false;
	}
}
