package com.iiitb.geeks.arrays;
import java.util.*;
/*
 * LIS in tc o(nlogn)
 * 
 * */
public class _069LIS {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			implLIS(array);
		}
		scan.close();
	}
	// ceiling is the smallest element which is greater than or equal to element
	static int binaryCeil(int array[],int low,int high,int key){
		while(high-low>1){
			int mid=low+(high-low)/2;
			if(array[mid]>=key)
				high=mid;
			else
				low=mid;
		}
		return high;
	}
	static void implLIS(int array[]){
		int len=1;
		int table[]=new int[array.length];
		table[0]=array[0];
		for(int i=0;i<array.length;i++){
			if(array[i]<table[0])
				table[0]=array[1];
			else if(array[i]>table[len-1])
				table[len++]=array[i];
			else
				table[binaryCeil(array, -1, len-1, array[i])]=array[i];
		}
		
		System.out.println(len);
	}
	
}
