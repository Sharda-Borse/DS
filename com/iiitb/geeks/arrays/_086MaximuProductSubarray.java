package com.iiitb.geeks.arrays;
import java.util.*;
public class _086MaximuProductSubarray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			System.out.println(printMaxProductArray(array));
		}
	}
	static int printMaxProductArray(int array[]){
		int n=array.length;
		int max_ending_here=1;
		int max_so_far=1;
		int min_ending_here=1;
		for(int i=0;i<n;i++){
			if(array[i]>0){
				max_ending_here=max_ending_here*array[i];
				min_ending_here=Math.min(min_ending_here*array[i], 1);
			}
			else if(array[i]==0){
				max_ending_here=1;
				min_ending_here=1;
			}
			else{
				int temp=max_ending_here;
				max_ending_here=Integer.max(min_ending_here*array[i], 1);
				min_ending_here=temp*array[i];
			}
			if(max_so_far<max_ending_here)
				max_so_far=max_ending_here;
				
		}
		return max_so_far;
	}
}
