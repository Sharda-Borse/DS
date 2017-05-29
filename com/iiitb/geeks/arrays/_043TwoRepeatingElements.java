package com.iiitb.geeks.arrays;

import java.util.Scanner;
/*
 * 1) given array elements are in range 1 to n (use array element as indexes)
 * so we are making its array location at the index of occurrence of element negative 
 * if it occurs second time print it
 * 2) sum elements up to n-2 i.e (n-2)*(n-1)/2
 * sum all elements in array 
 * take diffrenece =x+y
 * xy=product/fact(n)
 * x-y=sqrt((x+y)^2-4*xy)
 * 3) xor 
 * xor all elements from 1to n
 * then xor the result with array 1 to n
 * result is xor of two repeated elements
 * 
 * 
 * */
public class _043TwoRepeatingElements {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		repeatingElements(array);
		scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}	
	static void repeatingElements(int array[]){
		for(int i=0;i<array.length;i++){
			if(array[Math.abs(array[i])]>0)
				array[Math.abs(array[i])]=-array[Math.abs(array[i])];
			else
				System.out.print(Math.abs(array[i])+" ");
		}
		System.out.println();
	}
}
