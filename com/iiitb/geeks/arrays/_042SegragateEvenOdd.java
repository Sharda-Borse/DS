package com.iiitb.geeks.arrays;

import java.util.Scanner;

public class _042SegragateEvenOdd {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		segragateEvenOdd(array);
		printArray(array);
		scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}	
	static void segragateEvenOdd(int array[]){
		int low=0,high=array.length-1;
		while(low<high){
			while(array[low]%2==0)
				low++;
			while(array[high]%2==1)
				high--;
			if(low<high){
				int temp=array[low];
				array[low]=array[high];
				array[high]=temp;
			}
		}
	}
}
