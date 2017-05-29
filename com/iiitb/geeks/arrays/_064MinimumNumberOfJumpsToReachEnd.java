package com.iiitb.geeks.arrays;

import java.util.Scanner;

public class _064MinimumNumberOfJumpsToReachEnd {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		System.out.println(countMinimumNumberJumps(array, 0, n-1));
		System.out.println(countDPMinimumNumberJumps(array));
		scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	static int countMinimumNumberJumps(int array[],int low,int high){
		
		if(high==low)
			return 0;
		if(array[low]==0)
			return Integer.MAX_VALUE;
		int min=Integer.MAX_VALUE;
		
		for(int i=low+1;i<=high&&i<=low+array[low];i++){
			int jumps=countMinimumNumberJumps(array, i, high);
			if(jumps!=Integer.MAX_VALUE&&jumps+1<min)
				min=jumps+1;
		}
		return min;
	}
	static int countDPMinimumNumberJumps(int array[]){
		int jumps[]=new int[array.length];
		if(array.length==0||array[0]==0)
			return Integer.MAX_VALUE;
		jumps[0]=0;
		for(int i=1;i<array.length;i++){
			jumps[i]=Integer.MAX_VALUE;
			for(int j=0;j<i;j++){
				if(i<=j+array[j]&&jumps[j]!=Integer.MAX_VALUE){
					jumps[i]=Integer.min(jumps[i],jumps[j]+1);
					break;
					}
			}
		}
		return jumps[array.length-1];
	}
}
//1 3 6 3 2 3 6 8 9 5