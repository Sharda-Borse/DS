package com.iiitb.geeks.arrays;
import java.util.*;
/*
 * t.c is o(n)
 * 
 * */
public class _005MajorityElement {
		public static void main(String args[]){
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			majorityElement(array);
			
			scan.close();
			
		}
		static int findCandidate(int array[]){
			int count=1,indexElement=array[0],index=0;
			for(int i=1;i<array.length;i++){
				if(array[i]==indexElement)
					count++;
				else
					count--;
				if(count==0){
					index=i;
					count=1;
				}
			}
			return indexElement;
		}
		static void majorityElement(int array[]){
			int element=findCandidate(array);
			int count=0;
			for(int i=0;i<array.length;i++){
				if(array[i]==element)
					count++;
			}
			if(count>(array.length/2))
				System.out.println("majority element found "+element);
			else
				System.out.println("Majority element not found");
		}

}
