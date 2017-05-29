package com.iiitb.geeks.arrays;
import java.util.*;

public class _062MaximumElementArrayIncreasingDescreasing {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printMaximumElementFirstIncreasingDescreasing(array);
		System.out.println(binarySearch(array, 0, n-1)+" index :"+index);
		scan.close();
	}
	static void printMaximumElementFirstIncreasingDescreasing(int array[]){
		int max=array[0];int index=0;
		for(int i=1;i<array.length-1;i++){
			if(array[i-1]<array[i]&&array[i]>array[i+1]){
				max=array[i];index=i;
				}
		}
		System.out.println(max+" "+index);
	}
	static int index;
	static int binarySearch(int array[],int low,int high){
		if(low<=high){
			int mid=low+(high-low)/2;
			if(array[mid-1]<array[mid]&&array[mid]>array[mid+1]){
				index=mid;
				return array[mid];
			}
			else if(array[mid]>array[mid+1]&&array[mid]<array[mid-1])
				return binarySearch(array, low, mid-1);
			else
				return binarySearch(array, mid+1, high);
				
		}
		return -1;
	}
}

/*11
8 10 20 80 100 200 400 500 3 2 1*/