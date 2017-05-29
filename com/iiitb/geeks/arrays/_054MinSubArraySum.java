package com.iiitb.geeks.arrays;

import java.util.Scanner;

public class _054MinSubArraySum {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		int s=scan.nextInt();
		
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		System.out.println(printMinLengthForGivenSum(array, s));
		System.out.println(start+" to "+end);
		scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	/*
	6
	7
	2 3 1 2 4 3*/
	static int start,end;
	static int printMinLengthForGivenSum(int array[],int s){
		int minLen=Integer.MAX_VALUE;
		int sum=0;
		int i=0,j=0;
		while(j<array.length){
			if(sum<s){
				sum+=array[j];
				j++;
			}
			else{
				minLen=Integer.min(minLen, j-i);
				start=i;end=j;
				if(i==j-1)
					return 1;
				sum-=array[i];
				i++;
			}
		}
		while(sum>=s){
			minLen=Integer.min(minLen, j-i);
			start=i;end=j;
			sum-=array[i++];
		}
		return minLen==Integer.MAX_VALUE?0:minLen;
	}
}
