package com.iiitb.geeks.arrays;
import java.util.*;

public class _061maximumLengthBitonicSubArray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		
		maximumLengthBitonic(array);
		scan.close();
	}
	
//	6
//	12 4 78 90 45 23
//	
	static void maximumLengthBitonic(int array[]){
		int inc[]=new int[array.length];
		int dec[]=new int[array.length];
		inc[0]=1;dec[array.length-1]=1;
		int max;
		int index=0;
		for(int i=1;i<array.length;i++)
			inc[i]=(array[i]>array[i-1]?inc[i-1]+1:1);
		for(int i=array.length-2;i>=0;i--)
			dec[i]=(array[i]>array[i+1]?dec[i+1]+1:1);
		
		max=inc[0]+dec[0]-1;
		for(int i=1;i<array.length;i++){
			if((inc[i]+dec[i]-1)>max){
				max=inc[i]+dec[i]-1;
				index=i;
				}
		}
		
		System.out.println(max+" "+index);
	}
}
