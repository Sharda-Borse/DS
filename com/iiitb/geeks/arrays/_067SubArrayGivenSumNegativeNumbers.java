package com.iiitb.geeks.arrays;
import java.util.*;
/*
 *
 * */
public class _067SubArrayGivenSumNegativeNumbers {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int sum=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();

			printSubarraySumOpt(array, sum);
			System.out.println(maxSubArrayLen(array,sum));
		}
		scan.close();
	}
	static int start,end;
	static void printSubarraySumOpt(int array[],int sum){
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int currentSum=0;
		for(int i=0;i<array.length;i++){
			currentSum+=array[i];
			if(sum==currentSum)
				System.out.println("0  "+i);
			if(map.containsKey(currentSum-sum)){
				System.out.println((map.get(currentSum-sum)+1)+" "+i);
				return;
			}
			map.put(currentSum, i);
			
		}	
		System.out.println("For given sum subarray not found");
		return;
	}
	public static int maxSubArrayLen(int[] nums, int k) {
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    int max = 0;
	    int sum=0;
	    for(int i=0; i<nums.length; i++){
	        sum += nums[i];
	        if(sum==k){
	        }  
	            max = Math.max(max, i+1);
	        int diff = sum-k;
	        if(map.containsKey(diff)){
	            max = Math.max(max, i-map.get(diff));
	        }
	        if(!map.containsKey(sum)){
	            map.put(sum, i);
	        }
	    }
	 
	 
	    return max;
	}
}
