package com.iiitb.geeks.arrays;

import java.util.Scanner;

public class _051OccuranceOfElementSortedArray {
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int array[]=new int[n];
		int key=scan.nextInt();
		for(int i=0;i<n;i++)
			array[i]=scan.nextInt();
		printArray(array);
		
		System.out.println("Ocurrance of element "+key+" is :"+countElement(array, key));
		scan.close();
	}
	/*
	 * 7 1 2 2 3 3 3 3
	 * 
	 * */

	static void printArray(int array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	static int countElement(int array[],int key){
		int i,j;
		i=firstOccurance(array, 0, array.length-1,key);
		if(i==-1){
			System.out.println("Element "+key+" does not exists");
			return i;
		}
		j=lastOccurance(array, 0, array.length-1, key);
		return j-i+1;
	}
	static int firstOccurance(int array[],int low,int high,int key){
		if(low<=high){
			int mid=low+(high-low)/2;
			if((mid==0||array[mid-1]<key)&&array[mid]==key)
				return mid;
			else if(array[mid]>=key)
				return firstOccurance(array, low, mid-1, key);
			else
				return firstOccurance(array, mid+1, high, key);
				
		}
		return -1;
	}
	
	/*266 94  7 114
62 140 152 178 411 456 470 
	1 2 4 8 8 14 15 16 18 21 22 23 23 26 29 30 30 33 38 39 39 43 51 52 53 56 62 66 66 74 75 75 78 79 79 79 80 81 81 81 83 85 85 86 92 94 94 96 98 98 105 105 107 107 109 110 111 112 113 115 118 119 125 127 130 136 136 141 141 142 144 144 145 147 147 148 150 152 153 154 157 159 163 166 166 167 167 169 169 171 172 172 173 173 178 179 181 181 182 182 184 185 187 188 190 192 194 194 195 198 198 200 200 200 200 206 207 207 209 211 214 215 217 217 218 222 227 232 233 237 244 246 248 248 249 251 252 253 254 254 254 260 262 262 268 269 269 269 272 272 275 275 277 278 282 282 283 286 288 289 290 292 294 297 302 306 311 312 314 316 319 319 321 322 322 328 332 334 338 344 349 352 354 356 356 358 360 361 361 362 364 366 368 369 373 373 375 377 379 382 383 386 388 389 389 391 391 395 397 397 407 407 412 413 414 416 417 421 423 423 423 427 429 430 432 432 432 433 445 446 447 448 448 448 448 449 450 451 456 456 456 456 462 465 466 469 470 470 474 474 476 477 479 480 482 483 485 487 487 487 488 488 490 490 494 499*/ 
	static int lastOccurance(int array[],int low,int high,int key){
		if(low<=high){
			int mid=low+(high-low)/2;
			if((mid==array.length-1||array[mid+1]>key)&&array[mid]==key)
				return mid;
			else if(array[mid]<=key)
				return lastOccurance(array, mid+1, high, key);
			else
				return lastOccurance(array, low, mid-1, key);
		}
		return -1;
	}

}
