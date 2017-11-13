package com.kuaipai;

/**
 * ����QuickSort
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
	 * @param start����������ʼ
	 * @param end����λ
	 */
	public static void quickSort(int[] arr,int start,int end){
		if(start<end){
			//��������λ
			int index = getIndex(arr,start,end);
			quickSort(arr,0,index-1);
			quickSort(arr,index+1,end);
		}
	}
	
	/**
	 * ��������������ֵ
	 * @param arr
	 * @param start
	 * @param end
	 * @return
	 */
	public static int getIndex(int[] arr,int start,int end){
		int i = start;
		int j = end;
		
		//��һ����λ
		int x = arr[i];//x�ǻ�׼��
		while(i<j){
			//�ȴ�������Աȣ���С��x��
			while(i<j && arr[j]>=x){
				j--;
			}
			if(i<j){
				//���ҵ���Ԫ�ش����һ����λ
				arr[i] = arr[j];
				i++;
			}
			
			//��������ҵ�
			while(i<j && arr[i]>=x){
				i++;
			}
			if(i<j){
				//���ҵ������һ����λ
				arr[j] = arr[i];
				j--;
			}
		}
		arr[i] = x;  
		
		return i;
	}
}
