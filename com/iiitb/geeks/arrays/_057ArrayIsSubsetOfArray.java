package com.iiitb.geeks.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class _057ArrayIsSubsetOfArray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first array size and elements in array ");
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		
		printArray(array);
		System.out.println("Enter second array size and elements in array ");
		int n1=scan.nextInt();
		int array1[]=new int[n1];
		for(int i=0;i<n1;i++)
			array1[i]=scan.nextInt();
		/*6
		11 1 13  21 3 7
		4
		11 3 7 1*/
		printArray(array1);
		if(n>=n1){
		if(isSubset(array,array1))
			System.out.println("Array2 is subset of array1");
		else
			System.out.println("Array2 is not subset of array1");
		}
		else{
			if(isSubset(array1,array))
				System.out.println("Array1 is subset of array2");
			else
				System.out.println("Array1 is not subset of array2");
		}
		if(n>=n1){
			if(isSubsetHashing(array,array1))
				System.out.println("Array2 is subset of array1");
			else
				System.out.println("Array2 is not subset of array1");
			}
			else{
				if(isSubsetHashing(array1,array))
					System.out.println("Array1 is subset of array2");
				else
					System.out.println("Array1 is not subset of array2");
					
				
			}
		scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	static boolean isSubset(int array1[],int array2[]){
		int i,j;
		for(i=0;i<array1.length;i++){
			for(j=0;j<array2.length;j++){
				if(array1[i]==array2[j])
					break;
				if(j==array2.length)
					return false;
			}
		}
		return true;
	}
	static boolean isSubsetHashing(int array1[],int array2[]){
		HashMap<Integer,Integer> mapArray1=new HashMap<Integer,Integer>();
		for(int i=0;i<array1.length;i++)
			mapArray1.put(array1[i], 1+(mapArray1.containsKey(array1[i])?mapArray1.get(array1[i]):0));
		for(int i=0;i<array2.length;i++){
			if(!mapArray1.containsKey(array2[i]))
				return false;
		}
		return true;
			
	}
	
}
