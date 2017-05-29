package com.iiitb.geeks.arrays;
import java.util.*;

/*
 * brute force approach take o(n^2) time
 * 
 * using balanced bst takes o(nlogn)
 * */
public class _063CountSmallerElementsRightSide {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		countSmaller(array);
		scan.close();
		
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	static void countSmaller(int array[]){
		int count[]=new int[array.length];
		for(int i=0;i<array.length;i++){
			int cnt=0;
			for(int j=i+1;j<array.length;j++){
				if(array[j]<array[i])
					cnt++;
			}
			count[i]=cnt;
		}
		printArray(count);
	}
}
