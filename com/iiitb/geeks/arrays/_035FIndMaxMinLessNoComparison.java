package com.iiitb.geeks.arrays;
import java.util.*;
public class _035FIndMaxMinLessNoComparison {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		int result[]=new int[2];
		result=findMaxMin(array);
		System.out.println("Min element : "+result[0]+" Max element : "+result[1]);
		System.out.println("Divide Conquer approach");
		int []resultDAC=divideConquerApproachMaxMin(array,0,n-1);
		System.out.println("Min element : "+resultDAC[0]+" Max element : "+resultDAC[1]);
		scan.close();
	}
	/*
	 * no of comparisons in worst case is 2(n-2)+1= 2n-3 and for best case n-2+1=n-1
	 * */
	static int[] findMaxMin(int array[]){
		int arr[]=new int[2];
		if(array.length==1){
			arr[0]=array[0];arr[1]=array[0];
			return arr;
		}
		if(array[0]<array[1]){
			arr[0]=array[0];
			arr[1]=array[1];
		}
		else{
			arr[0]=array[1];
			arr[1]=array[0];
		}
		for(int i=2;i<array.length;i++){
			if(array[i]<arr[0])
				arr[0]=array[i];
			else  if(array[i]>arr[1])
				arr[1]=array[i];
		}
		return arr;	
	}
	/*
	 * divide the array into two parts  in all case best worst avg
	 * is 3n/2-2
	 * */
	static int[] divideConquerApproachMaxMin(int array[],int low,int high){
		int result[]=new int[2];
		if((high-low+1)==1){
			result[0]=array[low];
			result[1]=array[low];
			return result;
		}
		if((high-low+1)==2){
			if(array[low]<array[high]){
				result[0]=array[low];
				result[1]=array[high];
			}
			else{
				result[0]=array[high];
				result[1]=array[low];
			}	
			return result;
		}
		int mid=low+(high-low)/2;
		int[] resultLeft=divideConquerApproachMaxMin(array, low, mid);
		int[] resultRight=divideConquerApproachMaxMin(array, mid+1,high);
		
		if(resultLeft[0]<resultRight[0])
			result[0]=resultLeft[0];
		else
			result[0]=resultRight[0];

		if(resultLeft[1]>resultRight[1])
			result[1]=resultLeft[1];
		else
			result[1]=resultRight[1];
		return result;
	}
}
