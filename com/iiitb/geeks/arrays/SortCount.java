package com.iiitb.geeks.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class SortCount {
    public static void main(String[] args) {
        int array[] = {0,0,0,1,3,3,2,1,3,5,6,0};
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0;i<array.length;i++)
			map.put(array[i], 1+(map.containsKey(array[i])?map.get(array[i]):0));

        ValueComparator<Integer,Integer> bvc = new ValueComparator<Integer,Integer>(map);
        TreeMap<Integer,Integer> sortedMap = new TreeMap<Integer,Integer>(bvc);
        sortedMap.putAll(map);

        ArrayList<Integer> output = new ArrayList<Integer>();
        for(Integer i : sortedMap.keySet()) {
            for(int c = 0; c < sortedMap.get(i); c++) {
                output.add(i);
            }
        }

        System.out.println(output.toString());
    }
}