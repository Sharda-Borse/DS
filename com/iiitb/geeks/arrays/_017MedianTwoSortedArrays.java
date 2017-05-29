package com.iiitb.geeks.arrays;
import java.util.*;

/*
 * median of two sorted arrays of equal size
 * brute force approach tc o(n)
 * iterate arrays till n then calculate median 
 * */
public class _017MedianTwoSortedArrays {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int a=scan.nextInt();
		int arrayA[]=new int[a];
		int arrayB[]=new int[a];
		System.out.println("Enter the elements for array A");
		for(int i=0;i<a;i++)
			arrayA[i]=scan.nextInt();
		for(int i=0;i<a;i++)
			arrayB[i]=scan.nextInt();
		System.out.println(medianOfTwoArrays(arrayA, arrayB));
		scan.close();
	}
	static int medianOfTwoArrays(int arrayA[],int arrayB[]){
		int m1=0,m2=0,i=0,j=0;
		int count;
		for(count=0;count<=arrayA.length;count++){
			if(arrayA[i]<arrayB[j]){
				m1=m2;
				m2=arrayA[i++];
			}
			else{
				m1=m2;
				m2=arrayB[j++];
			}
			if(i==arrayA.length){
				m1=m2;
				m2=arrayB[0];
			}
			else if(j==arrayB.length){
				m1=m2;
				m2=arrayA[0];
			}
		}
		
		return(m1+m2)/2;
	}
}
