package com.iiitb.geeks.arrays;
import java.util.*;
public class _004SumPairs {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		int sum=scan.nextInt();
		pairElements(array, sum);
		
		scan.close();
	}
	static void pairElements(int array[],int sum){
		Arrays.sort(array);
		int l=0,h=array.length-1;
		while(l<h){
			if(array[l]+array[h]==sum){
				System.out.println("Sum "+sum+" pair elements found in array"+array[l]+" "+array[h]);
				l++;h--;
			}
			else if(array[l]+array[h]<sum)
				l++;
			else 
				h--;
		}
	}
}
