package com.sorting;
import java.util.*;
public class SelectionSort {
	
	public static void main(String[] args) {
		int arr[]= {1,8,-2,1,0,34,5,-10};
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int minIndex=i;
//			int minElement=arr[minIndex];
			for(int j=i+1;j<n;j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex=j;
//					minElement=arr[j];
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}