package com.iiitb.geeks.arrays;
import java.util.*;

/*
 *  efficient solution iterate array two times tc o(n)
 *  
 * */
public class _033SmallestAndSecondSmallestElement {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		printTwoSmallestElements(array);
		scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	static void printTwoSmallestElements(int array[]){
		int first=Integer.MAX_VALUE,second=Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++){
			if(first>array[i]){
				second=first;
				first=array[i];
			}
			else if(array[i]<second&&array[i]!=first)
				second=array[i];
		}
		if(second==Integer.MAX_VALUE)
			System.out.println("Second Smallest element does not exist");
		else
			System.out.println("Smallest elements are : "+first+" "+second);
		System.out.println();
	}
	
}
