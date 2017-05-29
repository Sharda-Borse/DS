package com.iiitb.geeks.arrays;
import java.util.*;
/*
 * tc o(n^2)
 * */

public class _006MajorityElement {
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
		int count=0,max_count=0,maj_ele=array[0];
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				if(array[i]==array[j])
					count++;
				if(max_count<count){
					max_count=count;
					maj_ele=array[i];
				}
			}
			if(max_count>array.length/2){
				System.out.println("element pair found "+array[i]);
			break;	
			}
		}
	}
	
}
