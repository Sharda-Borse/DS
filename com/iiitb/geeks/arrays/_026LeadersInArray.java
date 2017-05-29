package com.iiitb.geeks.arrays;
import java.util.*;
/*
 * tc o(n)
 * traverse array from right and check for max element
 * if new element is max than the iterated element then print it and store it in max
 * */
public class _026LeadersInArray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printLeader(array);
		scan.close();
	}
	static void printLeader(int array[]){
		int max=array[array.length-1];
		System.out.print(max+" ");
		for(int i=array.length-2;i>=0;i--){
			if(max<array[i]){
				max=array[i];
				System.out.print(max+" ");
			}
				
		}
	}
}
