package com.iiitb.geeks.arrays;
import java.util.*;
public class _081SortedSubsequenceOfSize3 {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			printSequence(array);
		}/*1
		7
		12 11 10 5 6 2 30*/
		
		scan.close();
	}
	static void printSequence(int array[]){
		int n=array.length;
		int max=n-1,min=0;
		int i;
		int smaller[]=new int[n];int greater[]=new int[n];
		smaller[0]=-1;greater[n-1]=-1;
		for(i=0;i<n;i++){
			if(array[i]<=array[min]){
				min=i;
				smaller[i]=-1;
			}
			else
				smaller[i]=min;
		}
		for(i=n-2;i>=0;i--){
			if(array[i]>=array[max]){
				max=i;
				greater[i]=-1;
			}
			else
				greater[i]=max;
		}
		for(i=0;i<n;i++){
			if(smaller[i]!=-1&&greater[i]!=-1)
				System.out.println(array[smaller[i]]+" "+array[i]+" "+array[greater[i]]);
		}
	}
}
