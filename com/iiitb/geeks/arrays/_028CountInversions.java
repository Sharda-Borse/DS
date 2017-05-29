package com.iiitb.geeks.arrays;
import java.util.*;
/*
 * merge sort approach tc o(nlogn)
 * i<j but a[i]>a[j]
 * 5 4 3 2 1
 * */
public class _028CountInversions {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		System.out.println(mergeSortCountInversion(array,0,n-1));
		printArray(array);
		scan.close();
	}
	static int mergeSortCountInversion(int array[],int low,int high){
		int count=0;
		if(low<high){
			int mid=low+(high-low)/2;
			count=mergeSortCountInversion(array, low, mid);
			count+=mergeSortCountInversion(array, mid+1, high);
			count+=mergeArrays(array, low, mid, high);
		}
		return count;
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	static int mergeArrays(int array[],int low,int mid,int high){
		int temp[]=new int[high-low+1];
		int i=low,j=mid+1,k=0;
		int count=0;
		while(i<=mid&&j<=high){
			if(array[i]<=array[j])
				temp[k++]=array[i++];
			else{
				temp[k++]=array[j++];
				count+=(mid-i+1);
			}
		}
		while(i<=mid)
			temp[k++]=array[i++];
		while(j<=high)
			temp[k++]=array[j++];
		System.arraycopy(temp, 0, array,low,high-low+1 );
		
		return count;
	}
}
