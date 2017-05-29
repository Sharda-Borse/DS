package com.iiitb.geeks.arrays;
import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.io.*;
public class GFG1 {
    static int start,end;
    public static void main (String[] args) {
       Scanner scan=new Scanner(System.in);
            int test=scan.nextInt();
            for(int t=0;t<test;t++){
                int n=scan.nextInt();
                int sum=scan.nextInt();
                int array[]=new int[n];
                for(int i=0;i<n;i++)
                    array[i]=scan.nextInt();
               if(printSum(array,sum))
                    System.out.println(start+" "+end);
               else
                System.out.println("-1");
               if(printSum1(array,sum))
                   System.out.println(start+" "+end);
              else
               System.out.println("-1");
            }
    }
    static boolean printSum(int array[],int sum){
        int currentSum=0;
        for(int i=0;i<array.length;i++){
            currentSum=array[i];start=i;
            for(int j=i+1;j<array.length;j++){
                if(currentSum==sum){
                    end=j;
                    return true;
                }
                if(currentSum>sum)
                	break;
                currentSum+=array[j];
            }
        }
        return false;
    }
    
    static boolean printSum1(int arr[],int sum){
    int curr_sum, i, j;
      // Pick a starting point
    for (i = 0; i < arr.length; i++)
    {
        curr_sum = arr[i];
        start=i+1;
        // try all subarrays starting with 'i'
        for (j = i+1; j <= arr.length; j++)
        {
        	
            if (curr_sum == sum)
            {
               end=j;
                return true;
            }
            if (curr_sum > sum || j == arr.length)
                break;
           curr_sum = curr_sum + arr[j];
        }
    }
    return false;
    }
    
}
