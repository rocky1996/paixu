package com.xuanze;

/**
 * 选择排序
 * 	3 1 6 2 5
 * @author wujinfan
 * 算法：找出最小值，然后这个最小值和最前面的数据交换位置
 */


public class Test01 {
	public static void main(String[] args) {
		int[] a = {3,1,6,2,5};
		
		//选择排序
		for(int i=0;i<a.length-1;i++){
			
			//假设第一个是最小值
			//记录最小值元素的下标
			int min = i;
			
			for(int j=i;j<a.length;j++){
			
				if(a[min]<a[j+1]){//循环完了之后才交换位置	
					//给min重新赋值
					min=j+1;
				}
			}
			//在这个位置交换位置
			if(min!=i){
				int temp;
				temp = a[i];
				a[i] = a[min];
				a[min] = temp; 
			}
		}
		
		//输出
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}

/**
 *3 1 6 2 5
 *第一次循环
 *1 3 6 2 5
 *
 *3 6 2 5
 *第二次循环
 *2 6 3 5
 *
 *6 3 5
 *第三次循环
 *3 6 5
 *
 *6 5
 *第四次循环
 *5 6
 *
 *6
 *
 *第一次循环，下标从0开始
 *第二次循环，下标从1开始
 *第三次循环，下标从2开始
 *第四次循环，下标从3开始
 */
