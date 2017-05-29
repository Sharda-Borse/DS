package com.iiitb.geeks.arrays;

import java.util.Scanner;

public class _055MaxProductArray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		maxProduct(array);
			
		scan.close();
	}
	
	/*4
	2 3 -2 4*/
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	public static void maxProduct(int array[]){
		int max[]=new int[array.length];
		int min[]=new int[array.length];
		int result=array[0];
		max[0]=array[0];min[0]=array[0];
		for(int i=1;i<array.length;i++){
			if(array[i]>0){
				max[i]=Integer.max(array[i], max[i-1]*array[i]);
				min[i]=Integer.min(array[i], min[i-1]*array[i]);
			}
			else{
				max[i]=Integer.max(array[i], array[i]*min[i-1]);
				min[i]=Integer.min(array[i], array[i]*max[i-1]);
			}
			result=result>max[i]?result:max[i];
		}
		
		System.out.println(result);
	}
}	
