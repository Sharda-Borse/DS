package com.iiitb.geeks.arrays;
import java.util.*;
public class _003PairSum {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		int sum=scan.nextInt();
		checkPairSum(array, sum);
		scan.close();
	}
	
	static void checkPairSum(int array[],int sum){
		boolean map[]=new boolean[10000];
		for(int i=0;i<array.length;i++){
			int temp=sum-array[i];
			if(temp>=0&&map[temp])
				System.out.println("Sum "+sum+" pair found in array "+temp+" "+array[i]);
			map[array[i]]=true;
		}
	}
}
