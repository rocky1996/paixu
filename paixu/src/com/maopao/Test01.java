package com.maopao;


/**
 * ð�������������ڼ�¼�Ĺؼ��֣������������н�����ֱ��û�з���Ľ���Ϊֹ
 * @author wujinfan
 *
 */

public class Test01 {
	public static void main(String[] args){
		int[] a = {3,1,6,2,5};
		int count1 = 0;//���ٴεıȽ�
		int count2 = 0; //���ٴε��ƶ�
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
 *ԭ��
 *3 1 6 2 5
 *
 *��һ������
 *1 3 6 2 5
 *1 3 6 2 5
 *1 3 2 6 5
 *1 3 2 5 6
 *
 *1 3 2 5
 *�ڶ������� 
 *1 3 2 5
 *1 2 3 5
 *1 2 3 5
 *
 *1 2 3
 *����������
 *1 2 3
 *1 2 3
 *
 *1 2
 *���Ĵ�����
 *1 2
 *
 *
 *1-->4
 *2-->3
 *3-->2
 *4-->1
 */
