package com.iiitb.geeks.arrays;
import java.util.*;
/*
 *
 * */
public class _066SubArrayGivenSum {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int sum=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			if(printSubarraySum(array, sum))
				System.out.println(start+"  "+end);
			else
				System.out.println(sum+" is not possible in given array");
			
			printSubarraySumOpt(array, sum);
		}
		scan.close();
	}
	//1 8 15 2 4 8 9 5 10 23
	
	/*
	2
	5 12
	1 2 3 7 5
	10 15
	1 2 3 4 5 6 7 8 9 10*/
	static int start,end;
	static boolean printSubarraySum(int array[],int sum){
		int i=0,s;
		for(i=0;i<array.length;i++){
			s=array[i];start=i;
			for(int j=i+1;j<=array.length;j++){
				if(sum==s){
					end=j-1;
					return true;
				}
				if(s>sum||j==array.length)
					break;
				s+=array[j];
			}
		}
		return false;
	}
	static void printSubarraySumOpt(int array[],int sum){
		int currentSum=array[0],i,start=0;
		
		for(i=1;i<array.length;i++){
			currentSum+=array[i];
			while(currentSum>sum&&start<i){
				currentSum-=array[start];
				start++;
			}
			if(currentSum==sum){
		
				System.out.println(" Sum found in sub array "+start+" "+i);
				return;
			}
			
		}
		System.out.println("For given sum subarray not found");
		return;
	}
}
