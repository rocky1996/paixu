package com.xuanze;

/**
 * ѡ������
 * 	3 1 6 2 5
 * @author wujinfan
 * �㷨���ҳ���Сֵ��Ȼ�������Сֵ����ǰ������ݽ���λ��
 */


public class Test01 {
	public static void main(String[] args) {
		int[] a = {3,1,6,2,5};
		
		//ѡ������
		for(int i=0;i<a.length-1;i++){
			
			//�����һ������Сֵ
			//��¼��СֵԪ�ص��±�
			int min = i;
			
			for(int j=i;j<a.length;j++){
			
				if(a[min]<a[j+1]){//ѭ������֮��Ž���λ��	
					//��min���¸�ֵ
					min=j+1;
				}
			}
			//�����λ�ý���λ��
			if(min!=i){
				int temp;
				temp = a[i];
				a[i] = a[min];
				a[min] = temp; 
			}
		}
		
		//���
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}

/**
 *3 1 6 2 5
 *��һ��ѭ��
 *1 3 6 2 5
 *
 *3 6 2 5
 *�ڶ���ѭ��
 *2 6 3 5
 *
 *6 3 5
 *������ѭ��
 *3 6 5
 *
 *6 5
 *���Ĵ�ѭ��
 *5 6
 *
 *6
 *
 *��һ��ѭ�����±��0��ʼ
 *�ڶ���ѭ�����±��1��ʼ
 *������ѭ�����±��2��ʼ
 *���Ĵ�ѭ�����±��3��ʼ
 */
