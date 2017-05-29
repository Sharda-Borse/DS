package com.iiitb.geeks.arrays;
import java.util.*;

/*
 * median of two sorted arrays of equal size
 * calculating median of each individual array then
 * comparing medians of two sorted arrays then apply divide and conquer approach  
 * */
public class _018MedianTwoSortedArrays {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int a=scan.nextInt();
		int arrayA[]=new int[a];
		int arrayB[]=new int[a];
		System.out.println("Enter the elements for array A");
		for(int i=0;i<a;i++)
			arrayA[i]=scan.nextInt();
		for(int i=0;i<a;i++)
			arrayB[i]=scan.nextInt();
		System.out.println(medianOfTwoArrays(arrayA,arrayB));
		scan.close();
	}
	/*
	2 6 10 23 25
	1 9 20 71 91
	median 15
	*/
	static int medianOfTwoArrays(int arrayA[],int arrayB[]){
		if(arrayA.length<=0)
			return -1;
		if(arrayA.length==1)
			return (arrayA[0]+arrayB[0])/2;
		if(arrayA.length==2)
			return (Integer.max(arrayA[0], arrayB[0])+Integer.min(arrayA[1],arrayB[1]))/2;
		int m1=median(arrayA);
		int m2=median(arrayB);
		if(m1==m2)
			return m1;
		if(m1<m2){
			if(arrayA.length%2==0)
				return medianOfTwoArrays(Arrays.copyOfRange(arrayA,arrayA.length/2,arrayA.length),Arrays.copyOfRange(arrayB,0,arrayB.length/2));
			return medianOfTwoArrays(Arrays.copyOfRange(arrayA,arrayA.length/2,arrayA.length),Arrays.copyOfRange(arrayB,0,(arrayB.length/2)+1));
		}
		if(arrayA.length%2==0)
			return medianOfTwoArrays(Arrays.copyOfRange(arrayB,arrayB.length/2,arrayB.length),Arrays.copyOfRange(arrayA,0,arrayA.length/2));
		return medianOfTwoArrays(Arrays.copyOfRange(arrayB,(arrayB.length/2),arrayB.length),Arrays.copyOfRange(arrayA,0,(arrayA.length/2)+1));
	}
	
	static int median(int array[]){
		if(array.length%2==0)
			return (array[array.length/2]+array[(array.length/2)-1])/2;
		else
			return array[array.length/2];
	}
}
