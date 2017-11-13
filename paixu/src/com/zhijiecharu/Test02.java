package com.zhijiecharu;

public class Test02 {
	public static void main(String[] args){
		int[] num = {2,10,5,22,1};
		InsertSort(num);
//		for(int i=0;i<num.length;i++){
//			System.out.println(num[i]);
//		}
		printArray(num);
	}
	
	public static void InsertSort(int arr[]){
		for(int i=1;i<arr.length;i++){
			int temp = arr[i];
			int j=0;
			for(j=i-1;j>=0;j--){
				if(arr[j]>temp){
					arr[j+1] = arr[j];
				}else{
					break;
				}
			}
			arr[j+1] = temp;
		}
	}
	
	public static void printArray(int[] arr){
		//System.out.println("[");
		for(int i=0;i<arr.length;i++){
			if(i!=arr.length-1){
				System.out.print(arr[i]+",");
			}else{
				System.out.println(arr[i]);
			}
		}
	}
}
