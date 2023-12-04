package com.demo.bean;

import java.util.*;

public class Sorting {
	public static void main(String[] args) {
		int[] arr= {3,5,1,2,34,23,7,89,89,0,4};
		
	
		selectionSort(arr);
		bubbleSort(arr);
		
	}

	private static void selectionSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			
			int min_idx=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_idx]){
					min_idx=j;
				}
				
			}
			int temp=arr[i];
			arr[i]=arr[min_idx];
			arr[min_idx]=temp;
			
			
		}
		System.out.println("sorted array with using of selection sort");
		System.out.println(Arrays.toString(arr));
		
		
	}
	private static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=1;j<arr.length;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		System.out.println("sorted array with using of bubble sort");
		System.out.println(Arrays.toString(arr));
	}

}
