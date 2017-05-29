package com.iiitb.geeks.arrays;

import java.util.Scanner;
/*
 * ceiling of element x is smallest element which is greater than or equal to x in given array.
 * floor  of element x is greatest element which is greater than or equal to x in given array.
 * 
 * */
public class _040FloorAndCeilingInSortedArrays {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		int x=scan.nextInt();
		int i=floorElement(array,0,n-1, x);
		if(i!=-1)
			System.out.println("floor of element "+x+" is "+array[i]);
		else
			System.out.print("floor of element is not possible for given element");
		
		i=ceilingElement(array,0,n-1, x);
		if(i!=-1)
			System.out.println("ceiling of element "+x+" is "+array[i]);
		else
			System.out.print("ceiling of element is not possible for given element");
		
		System.out.println();
		System.out.println("Binary Search method");
		i=binaryFloorElement(array,0,n-1, x);
		if(i!=-1)
			System.out.println("floor of element "+x+" is "+array[i]);
		else
			System.out.print("floor of element is not possible for given element");
		
		i=binaryCeilingElement(array,0,n-1, x);
		if(i!=-1)
			System.out.println("ceiling of element "+x+" is "+array[i]);
		else
			System.out.print("ceiling of element is not possible for given element");
		scan.close();
		}
		static void printArray(int array[]){
			for(int i=0;i<array.length;i++){
				System.out.print(array[i]+" ");
			}
			System.out.println();
		}	
		// floor greatest element which is smaller than or equal to x
		static int floorElement(int array[],int low,int high,int x){
			if(x>=array[high])
				return high;
			for(int i=low;i<high;i++){
				if(array[i]==x)
					return i;
				if(array[i]>x&&array[i-1]<=x)
					return i-1;
			}
			return -1;
		}
		static int binaryFloorElement(int array[],int low,int high,int x){
			if(high<low)
				return -1;
			if(x>=array[high])
				return high;
			int mid=low+(high-low)/2;
			if(x==array[mid])
				return mid;
			if(mid>0 && array[mid-1]<=x&&x<array[mid])
				return mid-1;
			if(x<array[mid])
				return binaryFloorElement(array, low, mid-1, x);
			return binaryFloorElement(array, mid+1, high, x);
			
		}
		// smallest element in array which is greater than or equal to x
		static int ceilingElement(int array[],int low,int high,int x){
			int i;
			if(x<=array[low])
				return low;
			for(i=low;i<high;i++){
				if(x==array[i])
					return i;
				if(array[i]<x&&array[i+1]>=x)
					return i+1;
			}
			return -1;
		}
		static int binaryCeilingElement(int array[],int low,int high,int x){
			if(high<low)
				return -1;
			if(x<=array[low])
				return low;
			if(x>array[high])
				return -1;
			int mid=low+(high-low)/2;
			if(x==array[mid])
				return mid;
			
			if(x<array[mid]){
					if(mid-1>=low&&array[mid-1]<x)
						return mid;
				return binaryCeilingElement(array, low, mid-1, x);
				}
			else{
				if(mid+1<=high && array[mid+1]>=x&&array[mid]<x)
					return mid+1;	
				return binaryCeilingElement(array, mid+1, high, x);
		}
	}
}
	