package com.iiitb.geeks.arrays;
import java.util.*;
public class _085PartitionProblem {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			int array[]=new int[n];
			for(int i=0;i<n;i++)
				array[i]=scan.nextInt();
			if(isPartition(array))
				System.out.println("YES");
			else
				System.out.println("NO");
			
			if(isPart(array,n))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		scan.close();
	}
	
	
	// tc o(2^n)
	static boolean isPartition(int array[]){
		int sum=0;
		for(int i=0;i<array.length;i++)
			sum+=array[i];
		if(sum%2!=0)
			return 	false;
		return subSet(array,array.length,sum);
	}
	static boolean subSet(int array[],int n,int sum){
		if(sum==0)
			return true;
		if(n==0&&sum!=0)
			return false;
		if(array[n-1]>sum)
			return subSet(	array, n-1, sum);
		return subSet(array, n-1, sum)||subSet(	array, n-1, sum-array[n-1]);
	}
	// dynamic programming 
	static boolean isPart(int array[],int n){
		int sum=0;
		for(int i=0;i<array.length;i++)
			sum+=array[i];
		if(sum%2!=0)
			return 	false;
		boolean part[][]=new boolean[sum/2+1][n+1];
		for(int i=0;i<=n;i++)
			part[0][i]=true;
		for(int i=1;i<=sum/2;i++)
			part[i][0]=false;
		for(int i=1;i<=sum/2;i++){
			for(int j=1;j<=n;j++){
				part[i][j]=part[i][j-1];
				if(i>=array[j-1])
					part[i][j]=part[i][j]||part[i-array[j-1]][j-1];
			}
		}
		return part[sum/2][n];
	}
}
