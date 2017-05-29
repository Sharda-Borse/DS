package com.iiitb.geeks.arrays;

import java.util.*;

public class _074FourSum {
	public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int sum=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<array.length;i++)
				array[i]=scan.nextInt();
			List<List<Integer>> list=printFourSumList(array,sum);
			for(List<Integer> l:list){
				for(Integer i:l){
					System.out.print(i+" ");
				}
				System.out.println();
			}
		}
	scan.close();
	}
	/*
	1
	6
	21
	1 4 45 6 10 12*/
	static List<List<Integer>> printFourSumList(int array[],int sum){
		List<List<Integer>> result=new ArrayList<List<Integer>>();
		Arrays.sort(array);
		for(int i=0;i<array.length-3;i++){
			if(i!=0&&array[i]==array[i-1])
				continue;
			for(int j=i+1;j<array.length-2;j++){
				if(j!=i+1&&array[j]==array[j-1])
					continue;
				int k=j+1;
				int l=array.length-1;
				while(k<l){
					if(array[i]+array[j]+array[k]+array[l]<sum)
						k++;
					else if(array[i]+array[j]+array[k]+array[l]>sum)
						l--;
					else{
						List<Integer> list=new ArrayList<Integer>();
						list.add(array[i]);
						list.add(array[j]);
						list.add(array[k]);
						list.add(array[l]);
						result.add(list);
						k++;l--;
						while(k<l&&array[k]==array[k-1])
							k++;
						while(k<l&&array[l]==array[l+1])
							l--;
					}
				}
			}
		}
		
		return result;
	}
}
