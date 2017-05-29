package com.iiitb.geeks.arrays;

import java.util.Scanner;

public class _068MaximumIncreasingSubsequence {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			System.out.println(maximumIncreasingSubsequence(array));
			
		}
		scan.close();
	}
	static int maximumIncreasingSubsequence(int array[]){
		int max=0;
		int msis[]=new int[array.length];
		for(int i=0;i<array.length;i++){
			msis[i]=array[i];
		}
		for(int i=1;i<array.length;i++){
			for(int j=0;j<i;j++){
				if(array[i]>array[j]&&msis[i]<msis[j]+array[i])
					msis[i]=msis[j]+array[i];
			}
		}
		for(int i=0;i<array.length;i++){
			if(max<msis[i])
				max=msis[i];
		}
		return max;
	}
	
}
