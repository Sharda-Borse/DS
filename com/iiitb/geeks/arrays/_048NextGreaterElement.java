package com.iiitb.geeks.arrays;

import java.util.Scanner;
import java.util.Stack;

public class _048NextGreaterElement {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		nextGreaterElement(array);
		
		System.out.println("Stack Implementation");
		nextGreaterElementOptimized(array);
		scan.close();
	}
	//7 	1 2 3 1 3 6 6
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	// brute force approach tc o(n) 
	static void nextGreaterElement(int array[]){
		int next;
		for(int i=0;i<array.length;i++){
			next=-1;
			for(int j=i+1;j<array.length;j++){
				if(array[j]>array[i]){
					next=array[j];
					break;
				}
			}
			System.out.println(array[i]+" "+next);
		}
	}
	// stack method tc o(n)
	static void nextGreaterElementOptimized(int array[]){
		Stack<Integer> stack=new Stack<Integer>();
		int n=array.length;
		stack.push(array[0]);
		for(int i=1;i<n;i++){
			while(!stack.isEmpty()&&stack.peek()<array[i])
				System.out.println("Next Greater element for : "+stack.pop()+" is "+array[i]);
			stack.push(array[i]);
		}
			while(!stack.isEmpty())
				System.out.println("Next greater elemnet for : "+stack.pop()+" is -1 ");
	}
}
