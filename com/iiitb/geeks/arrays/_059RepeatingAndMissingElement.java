package com.iiitb.geeks.arrays;

import java.util.*;

public class _059RepeatingAndMissingElement {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printMissingRepeatingElements(array);
		
		scan.close();
	}
	static void printMissingRepeatingElements(int array[]){
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		int miss = 0,repeat = 0;
		for(int i=1;i<=array.length;i++){
			map.put(i, 0);
		}
		for(int i=0;i<array.length;i++){
			map.put(array[i], 1+(map.containsKey(array[i])?map.get(array[i]):0));
		}
		for(Map.Entry<Integer, Integer> l:map.entrySet()){
			if(l.getValue()==0)
				miss=l.getKey();
			if(l.getValue()>1)
				repeat=l.getKey();
		}
		System.out.println(miss+" "+repeat);
	}
	static void printMissRepeat(int array[]){
		int miss = 0,repeat = 0;
		for(int i=0;i<array.length;i++){
			if(array[Math.abs(array[i])-1]>0)
				array[Math.abs(array[i])-1]=-array[Math.abs(array[i])-1];
			else
				repeat=Math.abs(array[i]);
		}
		for(int i=0;i<array.length;i++){
			if(array[i]>0)
				miss=i+1;
		}
		System.out.println(miss+" "+repeat);
	}
	
	
}
