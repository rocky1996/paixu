package com.zheban;

/**
 * 1.二分法查找是建立在已经排序的基础之上
 * 2.以下程序是从小到大
 * 3.并且这个里面没有重复的元素
 * @author wujinfan
 * 1 3 5 9 11 13 56
 * 已经排好序的int类型的数组，要求快速找出13这个元素的下标
 */

public class Test01 {
	public static void main(String[] args){
		/*
		 * 1 3 5 9 11 13 56
		 * int begin = 0;//说的是下标
		 * int end = 6;
		 * int mid = 3
		 * 中间元素9，9<13
		 * 
		 * begin = 中间元素的右边mid+1
		 * end = 6;
		 * mid = 5
		 * */
		
		int[] a = {1,3,4,5,7,8,9,10,14,23,25,29};
		int destElement = 10;
		
		//要求从a数组中查找10这个元素的
		int index = binarySearch(a,destElement);//如果找到就返回下标，找不到就返回-1
		System.out.println(index);
	}
	
	//完成折半查找的核心算法
	public static int binarySearch(int[] a,int destElement){
		int begin = 0;
		int end = a.length-1;
		
		while(begin<=end){
			
			int mid = (begin+end)/2;
			
			if(a[mid]==destElement){
				return mid;
			}else if(a[mid]>destElement){
				end = mid-1;
			}else if(a[mid]<destElement){
				begin = mid+1;
			}
		}
		return -1;
	}
}
