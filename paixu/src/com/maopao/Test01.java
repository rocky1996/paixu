package com.maopao;


/**
 * 冒泡排序：两两相邻记录的关键字，如果反序则进行交换，直到没有反序的交换为止
 * @author wujinfan
 *
 */

public class Test01 {
	public static void main(String[] args){
		int[] a = {3,1,6,2,5};
		int count1 = 0;//多少次的比较
		int count2 = 0; //多少次的移动
		int flag = 0;
		for(int i=a.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				count1++;
				if(a[j]>a[j+1]){
					count2++;
					flag = 1;
					int temp;
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			if(flag==0){
				break;
			}
		}
		
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		System.out.println(count1);
		System.out.println(count2);
	}	
}

/**
 *原串
 *3 1 6 2 5
 *
 *第一次排序
 *1 3 6 2 5
 *1 3 6 2 5
 *1 3 2 6 5
 *1 3 2 5 6
 *
 *1 3 2 5
 *第二次排序 
 *1 3 2 5
 *1 2 3 5
 *1 2 3 5
 *
 *1 2 3
 *第三次排序
 *1 2 3
 *1 2 3
 *
 *1 2
 *第四次排序
 *1 2
 *
 *
 *1-->4
 *2-->3
 *3-->2
 *4-->1
 */
