package com.kuaipai;

public class Test02 {
	public static void main(String[] args) {
		int[] arr =  {5,3,9,1,6,7,2,4,0,8};
		show(arr);
		
		quickSort(arr,0,arr.length-1);
	}
	
	public static void show(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.println(i+"");
		}
		System.out.println();
	}
	
	public static void quickSort(int[] arr,int start,int end){
		if(end-start<=1){
			
		}
	}
}
