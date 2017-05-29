package com.iiitb.geeks.arrays;
import java.util.*;
/*
 * iterative way to reverse array tc o(n)
 * */

public class _020ReverseArray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		reverseArray(array);
		printArray(array);
		scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	static void reverseArray(int array[]){
		int low=0,high=array.length-1;
		while(low<high){
			int temp=array[low];
			array[low]=array[high];
			array[high]=temp;
			low++;
			high--;
		}
	}
	
}
