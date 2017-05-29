package com.iiitb.geeks.arrays;

import java.util.Scanner;
/*
 * given pair (a,b) is possible only if a<b
 * pair (c,d) can follow (a,b) if b<c  
 * tc o(n^2)
 * */
public class _089MaximumLengthChainOfPairs {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int []array[]=new int[n][2];
			for(int i=0;i<n;i++){
				array[i][0]=scan.nextInt();
				array[i][1]=scan.nextInt();
				}
			printArray(array, n);	
			printLongestPairs(array, n);
		
		}
		scan.close();
	}
	/*
	1
	4
	 5  24
	 15 25
	27 40
	50 60*/
	static void printArray(int array[][],int n){
		for(int i=0;i<n;i++)
			for(int j=0;j<2;j++)
			System.out.print(array[i][j]+" ");
		
		
		System.out.println();
	}
	static void printLongestPairs(int array[][],int n){
		int i,j,max=0;
		int mcl[]=new int[n];
		for(i=0;i<n;i++)
			mcl[i]=1;
		for(i=1;i<n;i++)
			for(j=0;j<i;j++)
				if(array[i][0]>array[j][1]&&mcl[i]<mcl[j]+1)
					mcl[i]=mcl[j]+1;
		
		for(i=0;i<n;i++)
			if(max<mcl[i])
				max=mcl[i];
		
		System.out.println(max);
	}
	
}
