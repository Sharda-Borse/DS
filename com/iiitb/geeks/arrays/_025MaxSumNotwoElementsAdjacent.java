package com.iiitb.geeks.arrays;
import java.util.*;

public class _025MaxSumNotwoElementsAdjacent {

	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		System.out.println(maxSumNonAdjacentElements(array));
		
		scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	static int maxSumNonAdjacentElements(int array[]){
		int excl=0,incl=array[0],excl_new;
		for(int i=1;i<array.length;i++){
			excl_new=(incl>excl)?incl:excl;
			incl=excl+array[i];
			excl=excl_new;
		}
		return (incl>excl)?incl:excl;
	}
}
