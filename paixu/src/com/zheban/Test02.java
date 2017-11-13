package com.zheban;

public class Test02 {
	public static void main(String[] args){
		int[] a = {1,3,4,5,7,8,9,10,14,23,25,29};
		System.out.println(binarySearch(a,0,11,10));
	}
	
	public static int binarySearch(int[] a,int start,int end,int k){
		int mid;
		if(start>end){
			return -1;
		}else{
			mid = (start+end)/2;
			if(a[mid]==k){
				return mid;
			}else if(a[mid]>k){
				return binarySearch(a, start, end-1, k);
			}else if(a[mid]<k){
				return binarySearch(a, start+1, end, k);
			}
		}
		return -1;
	}
}
