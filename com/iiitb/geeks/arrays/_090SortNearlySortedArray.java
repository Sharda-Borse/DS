package com.iiitb.geeks.arrays;
import java.util.*;

/*
 * sort k nearly sorted array
 * 1) insertion sort take O(nk)
 * 2) min heap tc o(nlogn) sc o(k)
 * 3) balanced bst
 * */
public class _090SortNearlySortedArray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			printArray(array, n);
			printArray(sortNearlySorted(array, n),n);	
		}
	}
	static void printArray(int array[],int n){
		for(int i=0;i<n;i++)
			System.out.print(array[i]);
		System.out.println();
	}
	static int[] sortNearlySorted(int array[],int n){
		int i,j,key;
		for(i=0;i<n;i++){
			key=array[i];
			j=i-1;
			while(j>=0&&array[j]>key){
				array[j+1]=array[j];
				j=j-1;
			}
			array[j+1]=key;
		}
		return array;
	}
	// minheap
	
	
	// balanced bst
}
