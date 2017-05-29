package com.iiitb.geeks.arrays;
import java.util.*;

public class _022ArrayRotation {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		int d=scan.nextInt();
		rotateArray(array, d);
		printArray(array);
		scan.close();
	}
	// using temp array
	static void rotateArray(int array[],int d){
		int temp[]=new int[d];
		for(int i=0;i<d;i++)
			temp[i]=array[i];
		for(int i=0;i<(array.length-d);i++)
			array[i]=array[i+d];
		for(int i=0;i<d;i++)
			array[array.length-d+i]=temp[i];
		
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	/*
	static void reverseArray(int array[],int start,int end){
		while(start<end){
			int temp=array[start];
			array[start]=array[end];
			array[end]=temp;
			start++;end--;
		}
	}
		*/
}
	
