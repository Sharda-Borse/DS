package com.iiitb.geeks.arrays;
import java.util.*;

public class _073ThreeSumCloset {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			
		}
		scan.close();
	}
	static int print3Sum(int array[],int sum){
		int min=Integer.MAX_VALUE;
		int result=0;
		for(int i=0;i<array.length;i++){
			int j=i+1;int k=array.length-1;
			while(j<k){
				int s=array[i]+array[j]+array[k];
				int diff=Math.abs(s-sum);
				if(diff==0)
					return s;
				if(diff<min){
					min=diff;
					result=s;
				}
				if(s<=sum)
					j++;
				else
					k--;
			}
		}
		return result;
	}
	
}
