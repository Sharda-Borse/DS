package com.iiitb.geeks.arrays;
import java.util.*;

public class _010LargestContiguosSum {
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
		int max_Sum=array[0],current_Sum=array[0];
		for(int i=1;i<array.length;i++){
			current_Sum+=array[i];
			if(current_Sum<0)
				current_Sum=0;
			else if(max_Sum<current_Sum)
				max_Sum=current_Sum;
		}
		System.out.println("Largest possible sum is "+max_Sum);
	}
	
}
