package com.iiitb.geeks.arrays;
import java.util.Scanner;
/*
 * bst implementation in tc o(n)
 * */
public class _007MajorityElementBST {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		majorityElement(array);
		scan.close();
	}
	static void majorityElement(int array[]){
		
	}
}
