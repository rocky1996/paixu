package com.xuanze;

public class Test02 {
	public static void main(String[] args) {
		int[] a = {3,1,6,2,5};
		//在排序前打印
		printArray(a);
		SelectSort(a);
		//在排序后打印
		printArray(a);
	}
	
	public static void SelectSort(int[] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=x+1;y<arr.length;y++){
				if(arr[x]>arr[y]){
					int temp=arr[x];
					arr[x]=arr[y];
					arr[y]=temp;
				}
			}
		}
	}
	
	public static void printArray(int[] arr){
		System.out.println("[");
		for(int x=0;x<arr.length;x++){
			if(x!=arr.length-1){
				System.out.println(arr[x]+",");
			}else{
				System.out.println(arr[x]+"]");
			}
		}
	}
}
