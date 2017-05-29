
package com.iiitb.geeks.arrays;
import java.util.*;

public class _023ArrayRotationJugglingAlgorithm {
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
		
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	
}
	

	
