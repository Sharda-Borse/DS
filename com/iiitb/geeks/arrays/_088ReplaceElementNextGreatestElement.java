package com.iiitb.geeks.arrays;

import java.util.*;

public class _088ReplaceElementNextGreatestElement {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			printArray(array, n);	
			printArray(replaceElemnetNextGreatestElment(array, n),n);
		}
		scan.close();
	}
	static void printArray(int array[],int n){
		for(int i=0;i<n;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	static int[] replaceElemnetNextGreatestElment(int array[],int n){
		int max=-1;
		int replaced[]=new int[n];
		replaced[n-1]=-1;
		for(int i=n-2;i>=0;i--){
			max=Integer.max(max, array[i+1]);
			replaced[i]=max;
		}
		return replaced;
	}
}
