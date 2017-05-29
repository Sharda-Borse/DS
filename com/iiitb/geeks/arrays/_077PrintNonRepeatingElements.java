package com.iiitb.geeks.arrays;
import java.util.*;

public class _077PrintNonRepeatingElements {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			printNonRepeating(array);
		}
		scan.close();
	}
	static void printNonRepeating(int array[]){
		int x=0,y=0;
		int xor=0;
		for(int i=0;i<array.length;i++)
			xor^=array[i];
		int set_bit=xor&~(xor-1);
		for(int i=0;i<array.length;i++){
			if((array[i] & set_bit)>0)
				x^=array[i];
			else
				y^=array[i];
		}
		System.out.println(x+" "+y);
	}
}//  4 2 4 5 2 3 3 1 4 1
