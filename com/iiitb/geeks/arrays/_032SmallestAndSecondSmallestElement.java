package com.iiitb.geeks.arrays;
import java.util.*;

/*
 * using TreeMap print the first two elements of keyset
 * built-in tc for construction of tree 
 * */
public class _032SmallestAndSecondSmallestElement {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		printTwoSmallestElements(array);
		scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++)
			System.out.print(array[i]+" ");
		System.out.println();
	}
	static void printTwoSmallestElements(int array[]){
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
		for(int i=0;i<array.length;i++)
			map.put(array[i], 1+(map.containsKey(array[i])?map.get(array[i]):0));
		ArrayList<Integer> list=new ArrayList<Integer>(map.keySet());
		
		
		System.out.println(list.get(0)+" "+list.get(1));
	}
	
}
