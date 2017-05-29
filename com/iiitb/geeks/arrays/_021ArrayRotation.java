package com.iiitb.geeks.arrays;
import java.util.*;

public class _021ArrayRotation {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		int d=scan.nextInt();
		rotateArray(array, d);
		scan.close();
	}
	static void rotateArray(int array[],int d){
		reverseArray(array, 0, d-1);
		printArray(array);
		reverseArray(array, d, array.length-1);
		printArray(array);
		reverseArray(array, 0, array.length-1);
		printArray(array);
		
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	static void reverseArray(int array[],int start,int end){
		while(start<end){
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;end--;
		}
	}
	
}
