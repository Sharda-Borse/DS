package com.iiitb.geeks.arrays;
import java.util.*;


public class _070TwoSumArray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int sum=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<array.length;i++)
				array[i]=scan.nextInt();
			int result[]=twoSum(array, sum);
			System.out.println("result is here ");
			printArray(result);
		}
		scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	/* given sum find a pair in array and return it
	 * */
	static int[] twoSum(int array[],int sum){
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++)
				if(array[i]+array[j]==sum)
					return new int[]{i,j};
		}
		throw new IllegalArgumentException("Two sum Solution is not possible");
	}
	// twoSum in o(n) tc
	static int[] twoSumOp(int array[],int sum){
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++)
				map.put(array[i], i);
		for(int i=0;i<array.length;i++){
			int complement=sum-array[i];
			if(map.containsKey(complement)&&map.get(complement)!=i)
				return new int[]{i,map.get(complement)};
		} 	
		throw new IllegalArgumentException("Two sum Solution is not possible");
	}
	static int[] twoSumOp1(int array[],int sum){
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		for(int i=0;i<array.length;i++){
			int complement=sum-array[i];
			if(map.containsKey(complement)&&map.get(complement)!=i)
				return new int[]{i,map.get(complement)};
			map.put(array[i], i);
		} 	
		throw new IllegalArgumentException("Two sum Solution is not possible");
	}
}
