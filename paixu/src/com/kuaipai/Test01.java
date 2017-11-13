package com.kuaipai;

/**
 * 快排QuickSort
 * @author wujinfan
 *
 */
public class Test01 {
	public static void main(String[] args) {
		int[] arr =  {5,3,9,1,6,7,2,4,0,8};
		quickSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length-1;i++){
			System.out.print(i);
		}
	}
	
	/**
	 * 
	 * @param arr
	 * @param start数组索引开始
	 * @param end结束位
	 */
	public static void quickSort(int[] arr,int start,int end){
		if(start<end){
			//分区索引位
			int index = getIndex(arr,start,end);
			quickSort(arr,0,index-1);
			quickSort(arr,index+1,end);
		}
	}
	
	/**
	 * 分区并返回索引值
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */
	public static int getIndex(int[] arr,int start,int end){
		int i = start;
		int j = end;
		
		//挖一个坑位
		int x = arr[i];//x是基准数
		while(i<j){
			//先从右向左对比，比小于x的
			while(i<j && arr[j]>=x){
				j--;
			}
			if(i<j){
				//把找到的元素存入第一个坑位
				arr[i] = arr[j];
				i++;
			}
			
			//从左边向右的
			while(i<j && arr[i]>=x){
				i++;
			}
			if(i<j){
				//把找到的填到上一个坑位
				arr[j] = arr[i];
				j--;
			}
		}
		arr[i] = x;  
		
		return i;
	}
}
