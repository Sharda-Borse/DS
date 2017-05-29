package com.iiitb.arrays;
import java.util.*;


public class _7LargestSumArray{
	public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	int array[]=new int[num];
	for(int i=0;i<num;i++)
		array[i]=scan.nextInt();
	largestSum(array);
	scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	static void largestSum(int array[]){
	int max_sum=array[0],current_sum=array[0];
	for(int i=1;i<array.length;i++){
		current_sum=Integer.max(array[i], current_sum+array[i]);
		max_sum=Integer.max(max_sum,current_sum);
	}
	System.out.println("max sum possible in array is "+max_sum);
	}
	
}
