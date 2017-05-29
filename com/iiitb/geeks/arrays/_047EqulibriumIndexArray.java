package com.iiitb.geeks.arrays;
import java.util.Scanner;


/*
 * equlibrium index is a index where sum of elements at its lhs==rhs
 * tc =o(n^2) brute force approach
 * 
 * */
public class _047EqulibriumIndexArray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		equilibriumIndex(array);
		equilibriumIndexOptimized(array);
		scan.close();
	}
	//7 	1 2 3 1 3 6 6
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	static void equilibriumIndex(int array[]){
		for(int i=0;i<array.length;i++){
			int leftSum = 0,rightSum = 0;
			for(int j=0;j<i;j++){
				leftSum+=array[j];
			}
			for(int j=i+1;j<array.length;j++){
				rightSum+=array[j];
			}
			if(leftSum==rightSum)
				System.out.println("equilibrium index : "+i);
			
		}
	}
	static void equilibriumIndexOptimized(int array[]){
		int sum=0,leftSum=0;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
		for(int i=0;i<array.length;i++){
			sum-=array[i]; 
			if(leftSum==sum)
				System.out.println("equilibrium index :"+i);
			leftSum+=array[i];
		}
	}
}
//-7 1 5 2 -4 3 0
