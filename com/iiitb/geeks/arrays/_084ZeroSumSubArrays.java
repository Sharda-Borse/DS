package com.iiitb.geeks.arrays;
import java.util.*;

/*
 * total number of zero sum subarrays
 * */
public class _084ZeroSumSubArrays {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			printCountZeroSumSubArrays(array);
		}
		scan.close();
	}
	static void printCountZeroSumSubArrays(int array[]){
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int count=0,sum=0;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
			if(sum==0)
				count++;
			if(!map.containsKey(sum))
				map.put(sum, 1);
			else{
				count+=map.get(sum);
				map.put(sum, map.get(sum)+1);
			}
		}
		System.out.println(" count of sub arrays : "+count);
	}
	
}
