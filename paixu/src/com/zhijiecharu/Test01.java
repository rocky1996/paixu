package com.zhijiecharu;

public class Test01 {
	public static void main(String[] args) {
		int[] num = {2,10,5,22,1};
		
		//Ҫ�Ƚϵ�����
		for(int i=1;i<num.length;i++){
			int temp = num[i];//׿ΰÿ��Ҫ���������
			int j = 0;
			for(j=i-1;j>=0;j--){
				if(num[j]>temp){
					num[j+1] = num[j];
				}else{
					break;
				}
			}
			
			num[j+1] = temp;
		}
		
		//���
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}
	}
}

/**
 * 2 10 5 22 1
 * 2 10 5 22 1��һ�ֱȽ�һ��
 * 2 5 10 22 1�ڶ��ֱȽ�����
 * 2 5 10 22 1�����ֱȽ�һ��
 */