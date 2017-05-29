package com.iiitb.arrays;
import java.util.*;
public class _4HasArraySumCandidate{
	public static void main(String args[]){
	Scanner scan=new Scanner(System.in);
	int num=scan.nextInt();
	int array[]=new int[num];
	for(int i=0;i<num;i++)
		array[i]=scan.nextInt();
	int sum=scan.nextInt();
	isCandidate(array,sum);
	scan.close();
	}
	static void isCandidate(int array[],int sum){
	boolean map[]=new boolean[10000];
	for(int i=0;i<array.length;i++){
		int temp=sum-array[i];
		if(temp>=0&&map[temp]){
		System.out.println("candidate found for sum"+sum+" "+temp+" "+array[i]);
		}
		map[array[i]]=true;
	}
	}
}
