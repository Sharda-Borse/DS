package com.iiitb.geeks.arrays;
import java.util.*;
/*
 * tc o(n)
 * multiple occurances can be printed
 * xor method is limited 
 * */
public class _008OddOccuranceElement {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		oddOccurrance(array);
		scan.close();
	}
	static void oddOccurrance(int array[]){
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<array.length;i++){
			if(map.containsKey(array[i]))
				map.put(array[i], map.get(array[i])+1);
			else
				map.put(array[i], 1);
		}
		for(Map.Entry<Integer, Integer> i:map.entrySet()){
			if(i.getValue()%2==1)
				System.out.println("Odd Occurance of element in given array is "+i.getKey());
		}
	}
	
}
