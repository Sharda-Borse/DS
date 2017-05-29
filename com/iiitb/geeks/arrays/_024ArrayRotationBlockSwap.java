package com.iiitb.geeks.arrays;
import java.util.*;

public class _024ArrayRotationBlockSwap {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		int d=scan.nextInt();
		rotateArray(array,n, d);
		printArray(array);
		scan.close();
	}
	// using temp array
	static void rotateArray(int array[],int n,int d){
		if(n==d||d==0)
			return;
		if((n-d)==d){
			swap(array,0,n-d,d);
			return;
			}
		if(d<(n-d)){
			swap(array, 0,n-d, d);
			rotateArray(array, n-d, d);
		}
		else{
			swap(array,0,d,n-d);
			rotateArray(Arrays.copyOfRange(array, n-d,n),2*d- n, d);
		}
	}
	static void swap(int []array,int low,int high,int d){
		int i,temp;
		for(i=0;i<d;i++){
			temp=array[low+i];
			array[low+i]=array[high+i];
			array[high+i]=temp;
		}
			
		
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	
}