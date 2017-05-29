package com.iiitb.geeks.arrays;

import java.util.Scanner;
/*
 * tc for above algo is o(m+n)
 * 
 * */
public class _039UnionIntersectionTwoSortedArrays {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter size of first array");
		int n1=scan.nextInt();
		int array1[]=new int[n1];
		for(int i=0;i<n1;i++)
			array1[i]=scan.nextInt();
		System.out.println("Enter size of second array");
		int n2=scan.nextInt();
		int array2[]=new int[n2];
		for(int i=0;i<n2;i++)
			array2[i]=scan.nextInt();
		System.out.println("Given inputs are :");
		printArray(array1);
		printArray(array2);
		System.out.println("Union of above two arrays :");
		unionArrays(array1, array2);
		System.out.println("Intersection of above two arrays :");
		intersectionArrays(array1, array2);
		scan.close();
	}

	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}	
	
	static void unionArrays(int array1[],int array2[]){
		int i=0,j=0;
		while(i<array1.length&&j<array2.length){
			if(array1[i]<array2[j])
				System.out.print(array1[i++]+" ");
			else if(array1[i]>array2[j])
				System.out.print(array2[j++]+" ");
			else{
				System.out.print(array2[j++]+" ");
				i++;
				}
		}
		while(i<array1.length)
			System.out.print(array1[i++]+" ");
		while(j<array2.length)
			System.out.print(array2[j++]+" ");
		System.out.println();
	}
	static void intersectionArrays(int array1[],int array2[]){
		int i=0,j=0;
		while(i<array1.length&&j<array2.length){
			if(array1[i]<array2[j])
				i++;
			else if(array1[i]>array2[j])
				j++;
			else{
				System.out.print(array2[j++]+" ");
				i++;
				}
		}
		System.out.println();
	}
	/*5
	1 2 4 5 6
	4
	 2 3 5 7*/
	
	
}
