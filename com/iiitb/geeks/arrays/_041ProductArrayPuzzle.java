package com.iiitb.geeks.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _041ProductArrayPuzzle {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		prodArray(array);
		prodArrayOptimized(array);
		scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}	
	static void prodArray(int array[]){
		int left[]=new int[array.length];
		int right[]=new int[array.length];
		int product[]=new int[array.length];
		left[0]=1;right[array.length-1]=1;
		for(int i=1;i<array.length;i++)
			left[i]=array[i-1]*left[i-1];
		for(int i=array.length-2;i>=0;i--)
			right[i]=array[i+1]*right[i+1];
		for(int i=0;i<array.length;i++){
			product[i]=left[i]*right[i];
			System.out.print(product[i]+" ");
		}
		System.out.println();
	}
	static void prodArrayOptimized(int array[]){
		int i,temp=1;
		int prod[]=new int[array.length];
		Arrays.fill(prod, 1);
		for(i=0;i<prod.length;i++){
					prod[i]=temp;
					temp*=array[i];
		}
		temp=1;
		for(i=array.length-1;i>=0;i--){
			prod[i]*=temp;
			temp*=array[i];
			
		}
		for(i=0;i<array.length;i++)
			System.out.print(prod[i]+" ");
		System.out.println();
	}/*
	5
	10 3 5 6 2
	10 3 5 6 2 
	180 600 360 300 900 */
}
