package com.iiitb.arrays;
import java.util.*;


public class _6LargestSumArray{
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
	int max_sum=0,max_sum_ending=0;
	for(int i=0;i<array.length;i++){
		max_sum_ending=max_sum_ending+array[i];
		if(max_sum_ending<0)
			max_sum_ending=0;
		else if(max_sum<max_sum_ending)
			max_sum=max_sum_ending;
	}
	System.out.println("max sum possible in array is "+max_sum);
	}
	
}
