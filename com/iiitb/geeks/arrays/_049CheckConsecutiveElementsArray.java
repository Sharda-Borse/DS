package com.iiitb.geeks.arrays;

import java.util.Scanner;

public class _049CheckConsecutiveElementsArray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		if(checkConsecutive(array))
			System.out.println("ELement in array are consecutive");
		else
			System.out.println("ELement in array are not consecutive");
		
		if(checkConsecutiveOptimized(array))
			System.out.println("ELement in array are consecutive");
		else
			System.out.println("ELement in array are not consecutive");
		scan.close();
	}

	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	static boolean checkConsecutive(int array[]){
		
		if(array.length<1)
			return false;
		int min=getMin(array);int max=getMax(array);
		if(max-min+1==array.length){
			boolean visited[]=new boolean[array.length];
			for(int i=0;i<array.length;i++){
				if(visited[array[i]-min])
					return false;
				visited[array[i]-min]=true;
			}
			return true;
		}
		return false;
	}
	
	static boolean checkConsecutiveOptimized(int array[]){
		if(array.length<1)
			return false;
		int min=getMin(array);
		int max=getMax(array);
		if(max-min+1==array.length){
			for(int i=0;i<array.length;i++){
				int j;
				if(array[i]<0)
					j=-array[i]-min;
				else
					j=array[i]-min;
				if(array[j]>0)
					array[j]=-array[j];
				else
					return false;
				}
			return true;
		}
		return false;
	}
	
	
	static int getMin(int array[]){
		int min=array[0];
		for(int i=1;i<array.length;i++){
			if(array[i]<min)
				min=array[i];
		}
	return min;
	}
	static int getMax(int array[]){
		int max=array[0];
		for(int i=1;i<array.length;i++){
			if(array[i]>max)
				max=array[i];
		}
	return max;
	}
}
