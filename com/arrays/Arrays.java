package com.arrays;
import java.util.*;
public class Arrays {
	int arr[];
	int capacity;
	int size;
	public Arrays(int capacity)
	{
		this.capacity=capacity;
		arr=new int[capacity];
		size=0;
		
	}
	public int getCapacity()
	{
		return capacity;
	}
	public int getSize()
	{
		return size;
	}
	void display()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public int search(int element)
	{
		for(int i=0;i<size;i++)
		{
			if(element==arr[i])
			{
				return i;
			}
			
		}
		return -1;
	}
	public int access(int index)
	{
		if(index>=size || index<0)
		{
			System.out.println("invalid index");
			return -1;
		}
		return arr[index];
		
	}
	public boolean insert(int index,int element)
	{
		if(index>size || index<0 || size>=capacity)
		{
			System.out.println("invalid index");
			
			return false;
		}
		else
		{
			for(int i=size;i>index;i--)
			{
				arr[i]=arr[i-1];
			}
			
			arr[index]=element;
			size++;
			return true;
			
		}
	}
	public boolean delete(int index)
	{
		if(index>=size || index<0)
		{
			System.out.println("invalid index");
			return false;
		}
		else
		{
			for(int i=index;i<size-1;i++)
			{
				arr[i]=arr[i+1];
				
			}
			size--;
			return true;
		}
	}
	public boolean update(int index,int element)
	{
		if(index<0 || index>=size)
		{
			System.out.println("invalid index");
			return false;
		}
		else
		{
			arr[index]=element;
			return true;
		}
	}
	
	public static void main(String[] args) {
		Arrays arr1=new Arrays(5);
		
		arr1.insert(0, 1);
		arr1.insert(1, 3);
		arr1.insert(2, 5);
		arr1.insert(3, 7);
		arr1.insert(4, 9);
		arr1.update(0, 10);
		arr1.update(4, 100);
//		arr1.update(5, 50);
		arr1.display();
		System.out.println();
		arr1.delete(4);
		System.out.println(arr1.getSize());
		arr1.display();
//		System.out.println(arr1.search(1000));
//		System.out.println(arr1.access(4));
		
//		System.out.println(arr1.getCapacity());
//		System.out.println(arr1.getSize());
//		System.out.println(arr1.capacity);
		
//		System.out.println(arr1.insert(0, 10));
//		System.out.println("Size "+arr1.size+" "+"capacity "+arr1.capacity);
//	arr1.insert(0, 10);
//	//System.out.println("Size "+arr1.size+" "+"capacity "+arr1.capacity);
//	arr1.insert(1, 20);
//	//System.out.println("Size "+arr1.size+" "+"capacity "+arr1.capacity);
//	arr1.insert(2, 5);
//	//System.out.println("Size "+arr1.size+" "+"capacity "+arr1.capacity);
//	arr1.insert(2, 40);
//	//System.out.println("Size "+arr1.size+" "+"capacity "+arr1.capacity);
////	arr1.insert(4, 50);
//	arr1.insert(2, 1);
//	arr1.insert(5, 3);
	
	
//	arr1.insert(0, 60);
//	arr1.display();
////	System.out.println(arr1.size);
//	System.out.println();
//	System.out.println(arr1.getCapacity());
		
	}
}
