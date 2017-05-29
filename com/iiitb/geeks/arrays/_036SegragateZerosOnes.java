package com.iiitb.geeks.arrays;
import java.util.*;
/*
 * 
 * */
public class _036SegragateZerosOnes {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		segragateZerosOnes(array,0,n-1);
		printArray(array);
		scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	
	// swap zero elements and 1 elemnts by each other from opposite side t.c o(n)
	static void segragateZerosOnes(int array[],int low,int high){
		while(low<high){
			while(array[low]==0&&low<high)
				low++;
			while(array[high]==1&&low<high)
				high--;
			if(low<high){
				array[low++]=0;
				array[high--]=1;
			}
		}
	}
	
}
