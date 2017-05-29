package com.iiitb.geeks.arrays;

import java.util.Scanner;

public class _045MinimumUnSortedSubArray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		printUnsortedSubArray(array);
		printArray(array);
		scan.close();
	}
	//11 10 12 20 30 25 40 32 31 35 50 60
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}	
	static void printUnsortedSubArray(int array[]){
		int start=0,end=0;
		for(start=0;start<array.length-1;start++){
			if(array[start]>array[start+1])
				break;	
		}
		if(start==array.length-1){
			System.out.println(" Complete array is sorted");
		return;
		}
		for(end=array.length-1;end>=1;end--){
			if(array[end-1]>array[end])
				break;	
		}
		int min=array[start],max=array[end];
		
		
		// normal min max now find min and max in unsorted array
		
		for(int i=start;i<=end;i++){
			if(min>array[i]){
				min=array[i];
				}
			if(max<array[i])
				max=array[i];
		}
		
		for(int i=0;i<start;i++){
			if(array[i]>min){
				start=i;
				break;	
			}
		}
		for(int i=array.length-1;i>=end+1;i--){
			if(max>array[i]){
				end=i;
				break;
			}
		}
		System.out.println("Unsorted elments : min "+array[start]+" max :"+array[end]+" array indexes "+start+" "+end);
		for(int i=start;i<=end;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		
			
	}
}
