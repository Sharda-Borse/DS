package com.iiitb.geeks.arrays;

import java.util.*;

import javax.naming.spi.DirStateFactory.Result;

public class _056SummaryRanges {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		summaryRanges(array);
		List<String> list=summaryRanges1(array);
		for(String i:list)
			System.out.print(i+" ");
			
		scan.close();
	}
	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	static void summaryRanges(int array[]){
		
		int prev=array[0];int first=prev; 
		ArrayList<String> list=new ArrayList<String>();
		for(int i=1;i<array.length;i++){
			if(array[i]==prev+1){
				if(i==array.length-1)
					list.add(first+"->"+array[i]);
			}
			else{
					if(first==prev)
						list.add(first+" ");
					else
						list.add(first+"->"+prev);
					if(i==array.length-1)
						list.add(array[i]+" ");
					first=array[i];
				}
				prev=array[i];
			}
		for(String i:list){
			System.out.print(i);
		}
		System.out.println();
	}
	 public static List<String> summaryRanges1(int[] array) {
	        
         
	        
	        ArrayList<String> result=new ArrayList<String>();
	        int prev=array[0];
	        int first=prev;
	        if(array.length==0||array==null)
	            return result;
	        if(array.length==1)
	            result.add(array[0]+"");
	        
	        
	        for(int i=1;i<array.length;i++){
	            if(array[i]==prev+1){
	                if(i==array.length-1)
	                    result.add(first+"->"+array[i]);
	            }
	            else{
	                if(first==prev)
	                    result.add(first+"");
	                else
	                    result.add(first+"->"+prev);
	                if(i==array.length-1)
	                    result.add(array[i]+"");
	                first=array[i];
	            }
	        prev=array[i];
	        }
	    return result;
	    }
	
}

// 0,1,2,4,5,7