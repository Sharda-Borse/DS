package com.iiitb.geeks.arrays;
import java.util.*;

public class _009OddOccuranceElement {
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
		int res=0;
		for(int i=0;i<array.length;i++){
			res^=array[i];
		}
		System.out.println("odd occurance of element "+res);
	}
	
}
