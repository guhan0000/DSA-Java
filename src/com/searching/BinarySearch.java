package com.searching;

public class BinarySearch {
	
	public static int search(int arr[],int target) {
		int n=arr.length;
		int left=0;
		int right=n-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
			if(target==arr[mid]) {
				return mid;
			}
			else if(target>arr[mid]) {
				left=mid+1;
				
			}
			else {
				right=mid-1;
				
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,3,5,11,13};
		System.out.println(search(arr,7));
		
	}

}
