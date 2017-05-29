package com.iiitb.geeks.arrays;
import java.util.*;
public class _087PairWithGivendifference {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int array[]=new int[n];
			int diff=scan.nextInt();
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			
			printPairDifference(array,diff);
		}
		scan.close();
	}
	static void printPairDifference(int array[],int diff){
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++)
				map.put(array[i], 1);
		for(int i=0;i<array.length;i++){
			int sum=array[i]+diff;
			if(map.containsKey(sum)){
				System.out.println("pair found "+array[i]+" "+sum);
				
			}
			
		}
	}
}
