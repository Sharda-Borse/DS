package com.iiitb.geeks.arrays;
import java.lang.reflect.Array;
import java.security.KeyStore.Entry;
import java.util.*;
/*
 * 
 * find duplicates in tc =o(n) and sc o(1)
 * 
 * 
 * */
public class _076DuplicatesElementsArray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			int arr[]=Arrays.copyOf(array, n);
			int arr1[]=Arrays.copyOf(array, n);
			printDuplicates(array,n);
			System.out.println();
			printDuplicates(arr);
			System.out.println();
			printDuplicatesFinal(arr1, n);
			

		}
		scan.close();
	}
	
	// 		
	  public static void printDuplicates(int array[], int n)
      {
          boolean flag=false;
         HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
         for(int i=0;i<array.length;i++){
           if(map.containsKey(array[i])){
        	   flag=true;
        	   System.out.print(array[i]+" ");
        	   map.put(array[i], map.get(array[i])+1);
           }
           else
        	   map.put(array[i], 1);
       }
       if(!flag)
           System.out.print("-1");
      }
	/// best approach make a given element at array[i] make index at array[i] as negative 
	static void printDuplicates(int array[]){
		boolean flag=true;
		for(int i=0;i<array.length;i++){
			if(array[Math.abs(array[i])]>0){
				
				array[Math.abs(array[i])]=-array[Math.abs(array[i])];
				}
			else{
				
				System.out.print(Math.abs(array[i])+" ");
				}
		}
		if(!flag)
			System.out.println("-1");
	}
	// 0 1 1 1 1 as 1 
	public static void printDuplicatesFinal(int arr[], int n)
    {
		boolean flag=false;
		int[] temp = new int[n]; 
		for (int i = 0; i < n; i++) {
			int val =0;
				if (temp[arr[i]]>0) {
						if (temp[arr[i]] == 1){
							System.out.print(arr[i]+" ");
							flag=true;
						}
						val= temp[arr[i]]+1;
				}
				else {
					val= 1;
				}
				temp[arr[i]] = val;
		}
   if (!flag){
      System.out.print("-1");
   }
  }
}
/*
2
4
0 3 1 2
5
2 3 1 2 3 */