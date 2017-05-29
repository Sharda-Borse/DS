package com.iiitb.geeks.arrays;
import java.util.*;
public class _030SumOfTwoElementsCloseToZero {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		sumCloseToZero(array, 0, n-1);
		scan.close();
	}
	static void sumCloseToZero(int array[],int l,int h){
		Arrays.sort(array);
		int min_sum=Integer.MAX_VALUE,sum;int min_l=l,min_h=h;
		while(l<h){
			sum=array[l]+array[h];
			if(Math.abs(sum)<Math.abs(min_sum)){
				min_sum=sum;min_l=l;min_h=h;
			}
			if(sum<0)
				l++;
			else			
				h--;
			}
		System.out.println("Two elements whose sum is minimum "+array[min_l]+" "+array[min_h]+" and minimum sum is :"+min_sum);
	}
}
