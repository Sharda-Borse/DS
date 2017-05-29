package com.iiitb.geeks.arrays;
import java.util.*;
public class _080LongestBitonicSequence {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			System.out.println(longestBitonicSequence(array));
		}
		scan.close();
	}
	
	static int longestBitonicSequence(int array[]){
		int inc[]=new int[array.length];
		for(int i=0;i<array.length;i++)
			inc[i]=1;
		
		// compute max increasng subsequence
		 for(int i=1;i<array.length;i++)
			 for(int j=0;j<i;j++)
				 if(array[i]>array[j]&&inc[i]<inc[j]+1)
					 inc[i]=inc[j]+1;
			
		 // dec susequence
		 int dec[]=new int[array.length];
		 for(int i=0;i<array.length;i++)
				dec[i]=1;
		 for(int i=array.length-2;i>=0;i--)
			 for(int j=array.length-1;j>i;j++)
				 if(array[i]>array[j]&&dec[i]<dec[j]+1)
					 dec[i]=dec[j]+1;
		
		 int max=inc[0]+dec[0]-1;
		 for(int i=0;i<array.length;i++)
			 if(inc[i]+dec[i]-1>max)
				 max=inc[i]+dec[i]-1; 
		 return max;
	}
}
