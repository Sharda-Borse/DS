package com.iiitb.geeks.arrays;

import java.util.*;

public class _083LargestSubArrayZeroSum {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			maximumSubArrayWithSumZero(array);
			maxSubArrayZeroSum(array);
		}/*1
		7
		12 11 10 5 6 2 30*/
		
		scan.close();
	} 
	// brute force o(n^2) 
	static void maximumSubArrayWithSumZero(int array[]){
		int maxLen=0;
		int sum=0;
		int end=-1;
		for(int i=0;i<array.length;i++){
			sum=array[i];
			for(int j=i+1;j<array.length;j++){
				sum+=array[j];
				if(sum==0){
					maxLen=Integer.max(maxLen, j-i+1);
					end=j;
				}
			}
		}
		System.out.println(" max Length "+maxLen+" with start index :"+(maxLen-end+1)+" end "+end);
		
	}
	// hashing way
	static void maxSubArrayZeroSum(int array[]){
		int n=array.length;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int sum=0,maxLen=0;
		for(int i=0;i<n;i++){
			sum+=array[i];
			if(sum==0)
				maxLen=i+1;
			if(array[i]==0&&maxLen==0)
				maxLen=1;
			if(map.containsKey(sum))
				maxLen=Math.max(maxLen, i-map.get(sum));
			else
				map.put(sum, i);
		}
		System.out.println("maxLength : "+maxLen);
	}
}
