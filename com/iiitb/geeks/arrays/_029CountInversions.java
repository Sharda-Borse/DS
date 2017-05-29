package com.iiitb.geeks.arrays;
import java.util.*;
/*
 * brute force approach tc o(n^2)
 * i<j but a[i]>a[j]
 * 5 4 3 2 1
 * */
public class _029CountInversions {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		countInversions(array);
		scan.close();
	}
	static void countInversions(int array[]){
		int count=0;
		for(int i=0;i<array.length;i++){
			for(int j=i+1;j<array.length;j++){
				if(array[i]>array[j])
					count++;
			}
		}
		System.out.println("number of inversions are : "+count);
	}
}
