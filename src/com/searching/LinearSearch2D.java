package com.searching;
import java.util.*;
public class LinearSearch2D {
	
	public static int[] find(int arr[][],int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
	public static boolean contains(int arr[][],int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==target) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int arr[][]= {{1,2},{1,4,5},{3}};
		System.out.println(Arrays.toString(find(arr,100)));
		System.out.println(contains(arr, -1));
	}

}
