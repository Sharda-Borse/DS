package com.iiitb.geeks.arrays;
import java.util.*;
/*
 * minimum distance between two elements in given unsorted array 
 * */
public class _058MinimumDistanceBetweenTwoNumbers {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		System.out.println("Enter two elements from array to compute minimu distance");
		int x=scan.nextInt();
		int y=scan.nextInt();
		computeMinimuDistance(array, x, y);
		computeMinimuDistanceOpt(array, x, y);
		scan.close();
	}
	// 12 3 5 4 2 6 3 0 0 5 4 8 3 3 6
	//12 	3 5 4 2 6 5 6 6 5 4 8 3 3 6
	static void computeMinimuDistance(int array[],int x,int y){
		int minDistance=Integer.MAX_VALUE;
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				if(((array[i]==x&&array[j]==y)||(array[i]==y&&array[j]==x))&&minDistance>Math.abs(i-j))
					minDistance=Math.abs(i-j);
			}
		}
		System.out.println("Minimum distance between "+x+" "+y+" is "+minDistance);
	}
	
	static void computeMinimuDistanceOpt(int array[],int x,int y){
		int minDistance=Integer.MAX_VALUE;
		int prev = 0;
		int i;
		for(i=0;i<array.length;i++){
			if(array[i]==x||array[i]==y){
				prev=i;break;
			}
		}
		for(;i<array.length;i++){
			if(array[i]==x||array[i]==y){
				if(array[prev]!=array[i]&&minDistance>Math.abs(prev-i)){
					minDistance=Math.abs(prev-i);
					prev=i;
				}
				else
					prev=i;
			}
		}
		System.out.println("Minimum distance between "+x+" "+y+" is "+minDistance);
	}
	
}
