package com.iiitb.geeks.arrays;

import java.util.HashMap;
import java.util.Map;

public class SortByFrequency {
 
	static void sortByFreq( int[] A ) {

        // 1. create map<number, its count>
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < A.length; i++) 
        	map.put(A[i], 1+(map.containsKey(A[i])?map.get(A[i]):0));
        

        // 2. sort map by value in desc. order 
        // used modified (for desc. order) MapUtil in http://stackoverflow.com/questions/109383/how-to-sort-a-mapkey-value-on-the-values-in-java
        Map<Integer, Integer> map2= MapUtil.sortByValue(map);


        for(Map.Entry<Integer, Integer> entry : map2.entrySet() ) {
            for(int i = 0; i < entry.getValue(); i++ ) {
                System.out.print( entry.getKey()+ " ");
            }
        }
        System.out.println();
    }
}
