package com.iiitb.geeks.arrays;

import java.util.Scanner;
/*
 * using stack impl tc o(m+n)
 * */
public class _079NumberOfSinkNodes {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int m=scan.nextInt();
			int edgeFrom[]=new int[m];int edgeTo[]=new int[m];
			for(int i=0;i<m;i++){
				edgeFrom[i]=scan.nextInt();
				edgeTo[i]=scan.nextInt();
			}
			System.out.println(countSinkNodes(n+1, m, edgeFrom, edgeTo));
		}
		scan.close();
	}
	// n # nodes m # edges  edgeFrom[] edgeTo[]
	static int countSinkNodes(int n,int m,int edgeFrom[],int edgeTo[]){
		int mark[]=new int[n];
		for(int i=0;i<m;i++)
			mark[edgeFrom[i]]=1;
		int count=0;
		for(int i=1;i<n;i++)
			if(mark[i]!=1)
				count++;
		return count; 
	}
}
