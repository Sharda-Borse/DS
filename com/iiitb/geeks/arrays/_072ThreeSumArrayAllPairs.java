package com.iiitb.geeks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _072ThreeSumArrayAllPairs {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int sum=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<array.length;i++)
				array[i]=scan.nextInt();
			int result[]=threeSum(array, sum);
			System.out.println("result is here ");
			printArray(result);
		}
		scan.close();
	}
	/*1
	4
	2
	-1 2 1 -4*/
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	static int[] threeSum(int array[],int sum){
		int min=Integer.MAX_VALUE;
		int result=0;
		Arrays.sort(array);
		int i,j,k;
		for(i=0;i<array.length;i++){
			j=i+1;
			k=array.length-1;
			while(j<k){
				int s=array[i]+array[j]+array[k];
				int diff=Math.abs(sum-s);
				if(diff==0){
					System.out.println(result);
					return new int[]{array[i],array[j],array[k]};
					}
				if(diff<min){
					  min=diff;
					  result=s;
				}
				if(s<=sum){
					j++;
				}
				else
					k--;
			}
		}
		throw new IllegalArgumentException("Three elements is not possible");
	}
}
