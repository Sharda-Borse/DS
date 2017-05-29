package com.iiitb.geeks.arrays;
import java.util.*;
import java.util.Map.Entry;

public class _027SortElementsByFrequency {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printElementsByFrequency(array);
		scan.close();
	}
	static void printElementsByFrequency(int array[]){
	   Map<Integer, Integer> map = new HashMap<>();
	   for(int i = 0; i < array.length; i++) 
	       	map.put(array[i], 1+(map.containsKey(array[i])?map.get(array[i]):0));
	   List<Map.Entry<Integer,Integer>> list=new LinkedList<Map.Entry<Integer,Integer>>(map.entrySet());
	   Collections.sort( list, new Comparator<Map.Entry<Integer, Integer>>()
       {
		@Override
		public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
			return (o2.getValue()).compareTo( o1.getValue() );
		}
       });
	   //ArrayList<Integer> output=new ArrayList<Integer>();
	   for(Map.Entry<Integer, Integer> entry:list){
		   for(int i=0;i<entry.getValue();i++){
			   System.out.print(entry.getKey()+" ");
		   }
	   }
	   //System.out.println(output);

	}
}
