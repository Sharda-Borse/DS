package com.iiitb.arrays;
import java.util.*;
public class _3HasArraySumCandidate {
	static int indexL,indexR;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		System.out.println("Enter the elements of an array");
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		System.out.println("Enter the sum");
		int sum=scan.nextInt();
		if(elementsExists(array, sum))
			System.out.println("Given array exists elements of sum"+sum+" elements are"+array[indexL]+" "+array[indexR]);
		else
			System.out.println("Given array does not exists elements of sum"+sum);
		scan.close();
	}
	static boolean elementsExists(int array[],int sum){
		Arrays.sort(array);
		int l=0,r=array.length-1;
		while(l<r){
			if(sum==array[l]+array[r]){
				indexL=l;indexR=r;
				return true;
				}
			else if((array[l]+array[r])<sum)
				l++;
			else
				r--;
		}
		return false;
	}

}
