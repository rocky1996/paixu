package com.zheban;

/**
 * 1.���ַ������ǽ������Ѿ�����Ļ���֮��
 * 2.���³����Ǵ�С����
 * 3.�����������û���ظ���Ԫ��
 * @author wujinfan
 * 1 3 5 9 11 13 56
 * �Ѿ��ź����int���͵����飬Ҫ������ҳ�13���Ԫ�ص��±�
 */

public class Test01 {
	public static void main(String[] args){
		/*
		 * 1 3 5 9 11 13 56
		 * int begin = 0;//˵�����±�
		 * int end = 6;
		 * int mid = 3
		 * �м�Ԫ��9��9<13
		 * 
		 * begin = �м�Ԫ�ص��ұ�mid+1
		 * end = 6;
		 * mid = 5
		 * */
		
		int[] a = {1,3,4,5,7,8,9,10,14,23,25,29};
		int destElement = 10;
		
		//Ҫ���a�����в���10���Ԫ�ص�
		int index = binarySearch(a,destElement);//����ҵ��ͷ����±꣬�Ҳ����ͷ���-1
		System.out.println(index);
	}
	
	//����۰���ҵĺ����㷨
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
