package com.iiitb.geeks.arrays;
import java.util.*;
/*
 * tc using sum method o(n)
 * */
public class _011LargestContiguosSum {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		largestContiguosSum(array);
		scan.close();
	}
	static void largestContiguosSum(int array[]){
		int max_Sum=0,current_Sum=0;
		for(int i=0;i<array.length;i++){
			current_Sum=Integer.max(array[i],current_Sum+array[i]);
			max_Sum=Integer.max(current_Sum,max_Sum);
			
		}
		System.out.println("Largest possible sum is "+max_Sum);
	}
	
}
