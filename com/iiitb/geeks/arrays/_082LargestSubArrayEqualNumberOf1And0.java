package com.iiitb.geeks.arrays;

import java.util.*;

public class _082LargestSubArrayEqualNumberOf1And0 {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			printLargestSubArrayEqualNo01(array);
			printEqual01LargestSubArray(array);
			
		}/*1
		7
		12 11 10 5 6 2 30*/
		
		scan.close();
	}
	
	//1,0,1,1,0,1,0
	// brute force approach tc o(n^2)
	static void printLargestSubArrayEqualNo01(int array[]){
		int sum=0,maxSize=-1,startIndex=0;
		for(int i=0;i<array.length-1;i++){
			sum=array[i]==0?-1:1;
			for(int j=i+1;j<array.length;j++){
				sum+=array[j]==0?-1:1;
				if(sum==0&&maxSize<j-i+1){
					maxSize=j-i+1;
					startIndex=i;
				}
			}
		}
		if(maxSize==-1)
			System.out.println("No Such a subarray");
		else
			System.out.println("Subarray "+startIndex+" "+(startIndex+maxSize-1));
	}
	
	// optimal in o(n)
	static void printEqual01LargestSubArray(int array[]){
		int sum=0,maxSize=-1;
		int startIndex=0,endIndex=-1;
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int n=array.length;
		for(int i=0;i<n;i++)
			array[i]=(array[i]==0)?-1:1;
		for(int i=0;i<n;i++){
				sum+=array[i];
				if(sum==0){
					maxSize=i+1;
					endIndex=i;
				}
				if(map.containsKey(sum+n)){
					if(maxSize<(i-map.get(sum+n))){
						maxSize=i-map.get(sum+n);
						endIndex=i;
					}
				}
				else{
					map.put(sum+n,i);
				}
				
		}
		for(int i=0;i<n;i++)
			array[i]=array[i]==-1?0:1;
		
		System.out.println((endIndex-maxSize+1)+" to "+endIndex);
		System.out.println("max Size subarray "+maxSize);
	}
}
