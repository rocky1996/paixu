package com.maopao;

public class Test02 {
	public static void main(String[] args){
		int a[] = {3,1,6,2,5};
		Test02.BubbleSort(a, 5);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
	
	public static void BubbleSort(int k[],int n){
		int count1 = 0;
		int count2 = 0;
		
		for(int i=n-1;i>0;i--){
			for(int j=0;j<i;j++){
				count1++;
				if(k[j]>k[j+1]){
					count2++;
					int temp;
					temp = k[j];
					k[j] = k[j+1];;
					k[j+1] = temp; 
 				}
			}
		}
		System.out.println(count1);
		System.out.println(count2);
	}
}
