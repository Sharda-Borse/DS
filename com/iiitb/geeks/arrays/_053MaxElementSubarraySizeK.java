package com.iiitb.geeks.arrays;

import java.util.*;

public class _053MaxElementSubarraySizeK {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		int k=scan.nextInt();
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		printSlidingWindow(array,k);
		printMaxQueue(array, k);
		
		scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	static void printSlidingWindow(int array[],int k){
		int max;
		for(int i=0;i<=array.length-k;i++){
			max=array[i];
			for(int j=0;j<k;j++){
				if(array[i+j]>max)
					max=array[i+j];
			}
			System.out.print(max+ " ");
		}
		System.out.println();
		
	}
	// using queue tc o(n)
	/*2
	9 3
	1 2 3 1 4 5 2 3 6
	10 4
	8 5 10 7 9 4 15 12 90 13*/
	static void printMaxQueue(int array[],int k){
		int result[]=new int[array.length-k+1];
		LinkedList<Integer> deque=new LinkedList<Integer>();
		for(int i=0;i<array.length;i++){
			if(!deque.isEmpty()&& deque.peekFirst()==i-k)
				deque.poll();
			while(!deque.isEmpty()&&array[deque.peekLast()]<=array[i])
				deque.removeLast();
			deque.offer(i);
			if(i+1>=k)
				result[i+1-k]=array[deque.peek()];
		}
		printArray(result);
	}
	
}
