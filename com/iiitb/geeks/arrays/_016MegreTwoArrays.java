package com.iiitb.geeks.arrays;
import java.util.*;

public class _016MegreTwoArrays {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array M+N");
		int mn=scan.nextInt();
		System.out.println("Enter the size of array N");
		int n=scan.nextInt();
		int arrayMN[]=new int[mn];
		int m=mn-n;
		for(int i=0;i<mn;i++)
			arrayMN[i]=scan.nextInt();
		printArray(arrayMN);
		int arrayN[]=new int[n];
		for(int i=0;i<n;i++)
			arrayN[i]=scan.nextInt();
		printArray(arrayN);
		moveToEnd(arrayMN, mn);
		printArray(arrayMN);
		mergeTwoArrays(arrayMN, m, arrayN, n);
		printArray(arrayMN);
		scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		
		System.out.println();
	}
	static void mergeTwoArrays(int arrayMN[],int m,int arrayN[],int n){
		// i is index of mnarray elements index j is arrayn index k is to keep track of final array index
		
		int i=n,j=0,k=0;
		while(k<(m+n)){
			if((i<(m+n)&&arrayMN[i]<=arrayN[j])||j==n)
				arrayMN[k++]=arrayMN[i++];
			else
				arrayMN[k++]=arrayN[j++];
		}
	}
	static void moveToEnd(int array[],int size){
		int i,j=size-1;
		for(i=size-1;i>=0;i--){
			if(array[i]!=-1)
				array[j--]=array[i];
		}
		
	}
}
