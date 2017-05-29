package com.iiitb.geeks.arrays;

import java.util.Scanner;

public class _052MaximumJMinusI {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		
		printMaxJMinusI(array);
		printMaxJMinusIOptimized(array);
		scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	// tc o(n^2)
	static void printMaxJMinusI(int array[]){
		int maxDiff=-1;
		for(int i=0;i<array.length;i++){
			for(int j=array.length-1;j>=i;j--){
				if(array[j]>=array[i]&&maxDiff<(j-i))
					maxDiff=j-i;
			}
		}
		System.out.println("Max Difference :"+maxDiff);
	}
// tc o(n) sc =o(n)
	static void printMaxJMinusIOptimized(int array[]){
		int maxDiff=-1;
		int lMin[]=new int[array.length];
		int rMax[]=new int[array.length];
		lMin[0]=array[0];
		for(int i=1;i<array.length;i++)
			lMin[i]=Integer.min(array[i], lMin[i-1]);
		rMax[array.length-1]=array[array.length-1];
		for(int i=array.length-2;i>=0;i--)
			rMax[i]=Integer.max(array[i],rMax[i+1]);
		int i=0,j=0;
		while(i<array.length&&j<array.length){
			if(lMin[i]<=rMax[j]){
				maxDiff=Integer.max(maxDiff, j-i);
				j=j+1;
			}
			else
				i=i+1;
		}
		System.out.println("Max Difference :"+maxDiff);
	}

}
