package com.iiitb.geeks.arrays;
import java.util.*;

public class _037KLargestSmalestElement {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		
		int k=scan.nextInt();
		bubbleSortLargest(array, k);
		
		System.out.println(k+" largest element ");
		for(int l=k-1;l>=0;l--)
			System.out.print(array[n-l-1]+" ");
		System.out.println();
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		
		bubbleSortSmallest(array, k);
		System.out.println(k+" smallest element ");
		for(int l=0;l<k;l++)
			System.out.print(array[l]+" ");
		System.out.println();
		
		scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}	
	static void bubbleSortLargest(int array[],int k){
		for(int i=k-1;i>=0;i--){ 	
			for(int j=0;j<array.length-i-1;j++){
				if(array[j]>array[j+1]){
					int temp=array[j];array[j]=array[j+1];array[j+1]=temp;
				}
				
			}
		}
		//return array;
	}
	static void bubbleSortSmallest(int array[],int k){
		 for(int i = 0; i < k; i++)
	        {
	            int min_idx = i;
	            for (int j = i+1; j < array.length; j++)
	                if (array[j] < array[min_idx])
	                    min_idx = j;
	 
	            int temp = array[min_idx];
	            array[min_idx] = array[i];
	            array[i] = temp;
	        }
	}
}
