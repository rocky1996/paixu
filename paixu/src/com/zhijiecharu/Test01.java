package com.zhijiecharu;

public class Test01 {
	public static void main(String[] args) {
		int[] num = {2,10,5,22,1};
		
		//要比较的轮数
		for(int i=1;i<num.length;i++){
			int temp = num[i];//卓伟每次要插入的数字
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
		
		//输出
		for(int i=0;i<num.length;i++){
			System.out.println(num[i]);
		}
	}
}

/**
 * 2 10 5 22 1
 * 2 10 5 22 1第一轮比较一次
 * 2 5 10 22 1第二轮比较两次
 * 2 5 10 22 1第三轮比较一次
 */