package com.iiitb.geeks.arrays;

import java.util.Scanner;
/*
 * tc is o(n) sc =o(1)
 * */
public class _038MaximumDifferenceOftwoElements {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		System.out.print("Maximum Difference "+maximumDifference(array));
		scan.close();
	}
	
	static int maximumDifference(int array[]){
		int max_Diff=Integer.MIN_VALUE;
		int min_Element=array[0];
		int min_index=0,max_Index=0,max_IndexElement=0;
		for(int i=1;i<array.length;i++){
			if(array[i]-min_Element>max_Diff){
				max_Diff=array[i]-min_Element;
				max_Index=i;min_index=max_IndexElement;
				}
			if(array[i]<min_Element){
				min_Element=array[i];
				max_IndexElement=i;
				}
		}
		System.out.println("min element "+array[min_index]+" max element "+array[max_Index]);
		return max_Diff;
	}
}
