package com.algo;

public class BinarySearch {
	
	public static int binarySearch(int [] a,int n) {
		int low=0;
		int high=a.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(a[mid]==n) {
				return mid;
			}
			if(n<a[mid]) {
				high=mid-1;
				}
			else {
				low=mid+1;
				}
			}
		return -1;
	}
	
	public static void main(String args[]) {
		BinarySearch ob=new BinarySearch();
		int [] a= {2 ,5, 6, 7, 8, 9, 23 , 56 ,67};
		int x=a.length;
		int n=9;
		int res=ob.binarySearch(a ,n);
		if(res==-1) {
			System.out.println("Element is not present");
		}
		else {
			System.out.println("Element is present " +"index " + res);
		}
	}
	
}
