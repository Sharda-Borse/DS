package com.iiitb.geeks.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _071ThreeSumArray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<array.length;i++)
				array[i]=scan.nextInt();
			List<List<Integer>> l=threeSum(array);
			System.out.println("result is here ");
			
			System.out.print(l.listIterator());
			
		}
		scan.close();
	}
	/*1
	4    -1 0 1 2 -1 -4
	2
	-1 2 1 -4*/
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	static List<List<Integer>> threeSum(int array[]){
		List<List<Integer>> list=new ArrayList<List<Integer>>();
		
		if(array==null||array.length<3)
			return list;
		Arrays.sort(array);
		for(int i=0;i<array.length-2;i++){
			if(i==0||array[i]>array[i-1]){
				int j=i+1;
				int k=array.length-1;
				while(j<k){
					if(array[i]+array[j]+array[j]==0){
						List<Integer> l=new ArrayList<Integer>();
						l.add(array[i]);
						l.add(array[j]);
						l.add(array[k]);
						list.add(l);
						j++;
						k--;
						// handle duplicates
						while(j<k&&array[j]==array[j-1])
							j++;
						while(j<k&&array[k]==array[k+1])
							k++;
					}
					else if(array[i]+array[j]+array[j]<0)
						j++;
					else
						k--;
				}
			}
		}
		return list;
		}
}
