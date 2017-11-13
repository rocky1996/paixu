package com.guibing;

/**
 * �鲢����
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
		
		//�ҳ��м������
		int center = (left+right)/2;
		//����ߵ�������еݹ�
		sort(data,left,center);
		//���ұߵ�������еݹ�
		sort(data,center+1,right);
		//�ϲ�
		merge(data,left,center,right);
		print(data);
	}
	
	public static void merge(int[] data,int left,int center,int right){
		//����һ����ʱ������
		int[] tmparr = new int[data.length];
		//�������һ��Ԫ������
		int mid = center+1;
		//��¼��ʱ���������
		int thrid = left;
		//��������һ��Ԫ�ص�����
		int tmp = left;
		
		while(left <= center && mid <= right){
			//������������ȡ����С�ķ�����ʱ����
			if(data[left] <= data[mid]){
				tmparr[thrid++] = data[left++];
			}else{
				tmparr[thrid++] = data[mid++];
			}
		}
		
		//ʣ�ಿ�����η�����ʱ����
		while(mid <= right){
			tmparr[thrid++] = data[mid++];	
		}
		
		while(left <= center){
			tmparr[thrid++] = data[left++];
		}
		
		//����ʱ��������ݿ�����ԭ����
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
