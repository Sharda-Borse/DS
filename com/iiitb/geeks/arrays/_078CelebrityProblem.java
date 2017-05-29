package com.iiitb.geeks.arrays;
import java.util.*;

public class _078CelebrityProblem {
	static int array[][];
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		
		int test=scan.nextInt();
		for(int t=0;t<test;t++){
			int n=scan.nextInt();
			array=new int[n][n];
			
			for(int i=0;i<n;i++)
				for(int j=0;j<n;j++)
					array[i][j]=scan.nextInt();
			System.out.println(findCelebrity(array));
			
			System.out.println(" Stack Implementation ");
			System.out.println(findCele(n));
		}
		scan.close();
	}
	static boolean knows(int a,int b){
		return array[a][b]==1;
	}
	static int findCelebrity(int array[][]){
		int a=0,b=array.length-1;
		while(a<=b){
			if(knows(a, b))
				a++;
			else
				b--;
		}
		for(int i=0;i<array.length;i++){
			if((a!=i)&&((knows(a, i)||!knows(i, a))))
				return -1;
		}
		return a;
	}
	// stack implementation
	static int findCele(int n){
		Stack<Integer> stk=new Stack<Integer>();
		for(int i=0;i<n;i++)
			stk.push(i);
		int A=stk.pop();
		int B=stk.pop();
		while(stk.size()>1){
			if(knows(A, B))
					A=stk.pop();
			else
					B=stk.pop();
		}
		int C=stk.pop();
		if(knows(C, A))
			C=A;
		if(knows(C, B))
			C=B;
		for(int i=0;i<array.length;i++){
			if((C!=i)&&((knows(C, i)||!knows(i, C))))
				return -1;
		}
		return C;
	}
	
}
