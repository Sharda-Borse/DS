package com.iiitb.geeks.arrays;

import java.util.Scanner;

public class _044SortArraysOfZerosOnesTwos {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		sortArrays(array);
		printArray(array);
		scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}	
	static void sortArrays(int array[]){
		int low=0,high=array.length-1,mid=0;
		int temp=0;
		while(mid<=high){
			switch(array[mid]){
				case 0:
					if(array[low]!=array[mid]){
					temp=array[low];array[low]=array[mid];array[mid]=temp;
					}
					mid++;low++;
					break;
				case 1:
					mid++;
					break;
				case 2: 
					if(array[mid]!=array[high])
						temp=array[high];array[high]=array[mid];array[mid]=temp;
					high--;
					break;
				default:
					break;
			}
		}
	}
}
/*12
0 1 1 0 1 2 1 2 0 0 0 1*/
