package com.iiitb.geeks.arrays;
import java.util.*;

public class _075SmallestMissingElementUnsortedArray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			System.out.println(printSmallestMissingElement(array));
		}
		
		scan.close();
	}
	static int printSmallestMissingElement(int array[]){
		int shift=segragatePosNeg(array);
		return findSmallestMissingNumber(Arrays.copyOfRange(array,shift,array.length),array.length-shift);
	}
	static int segragatePosNeg(int array[]){
		int i=0,j=0;
		for(i=0;i<array.length;i++){
			if(array[i]<=0){
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				j++;
			}
		}
		return j;
	}
	static int findSmallestMissingNumber(int array[],int n){
		int i;
		for(i=0;i<n;i++){
			if((Math.abs(array[i])-1)<n&&array[Math.abs(array[i])-1]>0)
				array[Math.abs(array[i])-1]=-array[Math.abs(array[i])-1];
		}
		for(i=0;i<n;i++)
			if(array[i]>0)
				return i+1;
		
		return n+1;
		
	}
}
