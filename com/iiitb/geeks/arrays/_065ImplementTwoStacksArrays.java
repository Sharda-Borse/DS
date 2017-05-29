package com.iiitb.geeks.arrays;

import java.util.Scanner;

public class _065ImplementTwoStacksArrays {
	int size;
	static int top1;
	static int top2;
	static int array[];
	_065ImplementTwoStacksArrays(int n) {
		array=new int[n];
		top1=-1;
		top2=n;
		size=n;
	}
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		_065ImplementTwoStacksArrays call1=new _065ImplementTwoStacksArrays(n);
		
		call1.printArray(array);
		System.out.println(" top sizes "+top1+" : "+top2);
		call1.push1(11);
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		call1.push2(99);
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		call1.push1(21);
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		call1.push2(89);
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		call1.push1(31);
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		call1.push2(79);
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		call1.push1(41);
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		call1.push2(69);
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		call1.push1(51);
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		call1.push2(59);
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		call1.push2(19);
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		System.out.println(call1.pop1());
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		System.out.println(call1.pop2());
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		System.out.println(call1.pop1());
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		System.out.println(call1.pop2());
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		System.out.println(call1.pop1());
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		System.out.println(call1.pop2());
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		System.out.println(call1.pop2());
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		System.out.println(call1.pop2());
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		System.out.println(call1.pop2());
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		
		System.out.println(call1.pop1());
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);System.out.println(call1.pop1());
		call1.printArray(array);System.out.println(" top sizes "+top1+" : "+top2);
		scan.close();
	}
	 void push1(int x){
		if(top1<top2-1){
			top1++;
			array[top1]=x;
		}
		else
			System.out.println(" stack overflow");
	}
	 void push2(int x){
			if(top1<top2-1){
				top2--;
				array[top2]=x;
			}
			else
				System.out.println(" stack overflow");
		}
	 int pop1(){
		 if(top1>=0){
			 return array[top1--];
		 }
			return-1; 
	 }
	 int pop2(){
		 if(top2<size){
			 return array[top2++];
		 }
			return-1; 
	 }
	 
	 void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	static void stackImplementation(){
		
	}
	
}
