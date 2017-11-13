package com.guibing;

/**
 * 归并排序
 * @author wujinfan
 *
 */
public class Test01 {
	public static void main(String[] args) {
		int[] data = {5,3,6,2,1,9,4,8,7,0};
		print(data);
		mergeSort(data);
		System.out.println("------------");
		print(data);
	}
	
	public static void mergeSort(int[] data){
		sort(data,0,data.length-1);
	}
	
	public static void sort(int[] data,int left,int right){
		if(left>=right){
			return;
		}
		
		//找出中间的索引
		int center = (left+right)/2;
		//对左边的数组进行递归
		sort(data,left,center);
		//对右边的数组进行递归
		sort(data,center+1,right);
		//合并
		merge(data,left,center,right);
		print(data);
	}
	
	public static void merge(int[] data,int left,int center,int right){
		//创建一个临时的数组
		int[] tmparr = new int[data.length];
		//右数组第一个元素索引
		int mid = center+1;
		//记录临时数组的索引
		int thrid = left;
		//左边数组第一个元素的索引
		int tmp = left;
		
		while(left <= center && mid <= right){
			//从两个数组中取出最小的放入临时数组
			if(data[left] <= data[mid]){
				tmparr[thrid++] = data[left++];
			}else{
				tmparr[thrid++] = data[mid++];
			}
		}
		
		//剩余部分依次放入临时数组
		while(mid <= right){
			tmparr[thrid++] = data[mid++];	
		}
		
		while(left <= center){
			tmparr[thrid++] = data[left++];
		}
		
		//将临时数组的内容拷贝会原数组
		while(tmp <= right){
			data[tmp] = tmparr[tmp++];
		}
	}
	
	public static void print(int[] data){
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]+",");
		}
		System.out.println();
	}
}
