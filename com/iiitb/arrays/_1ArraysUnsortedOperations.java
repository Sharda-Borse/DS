package com.iiitb.arrays;
import java.util.*;
public class _1ArraysUnsortedOperations {
	static int indexSearch;
		public static void main(String args[]){
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int array[]=new int[n+2];
			for(int i=0;i<n;i++){
				array[i]=scan.nextInt();
				}
			printArray(array);
			System.out.println("Enter the element to be search in array");
			int key=scan.nextInt();
			if(searchElement(array,key))
				System.out.println("key "+key+" is found at in array at index "+indexSearch);
			else
				System.out.println("key "+key +" not found in array");
			System.out.println("Enter the element to be inserted in array");
			key=scan.nextInt();
			insertElement(array,key,n);
			printArray(array);
			System.out.println("Enter the element to be deleted from array");
			key=scan.nextInt();
			deleteElement(array,key);
			printArray(array);
			scan.close();
			}
			
			static void printArray(int array[]){
				for(int i=0;i<array.length;i++)
					System.out.print(array[i]+" ");
					
				System.out.println();
				}
			static void insertElement(int array[],int key,int n){
				array[n]=key;
				}
			static void deleteElement(int array[],int key){
				int index = array.length-1;
				if(searchElement(array,key))
					index=indexSearch;
				
				for(int i=index;i<array.length-1;i++){
				array[i]=array[i+1]		;
						}
				}
			
			/*
			 * linear serach as elements in array are unsorted
			 * */
				static boolean searchElement(int array[],int key){
					for(int i=0;i<array.length-2;i++){
						if(array[i]==key){
							indexSearch=i;
							return true;
						}
					}
					return false;
					}
}
