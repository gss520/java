package cn.guo.array2;

import java.util.Arrays;

public class Matrix2 {

	public static void main(String[] args) {
		System.out.println(args[1]);
		// TODO Auto-generated method stub
		int[] a = {1,2,3,322,32,56,78};
		String[] e = {"aaa","ccc","bbb"};
		
		System.out.println("*************");
		
		for(String i:e){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("*************");
		
		int[] b = {1,2,3,322,32,56,78};
		Arrays.sort(a);
		Matrix2.sort1(b);
		
	/*	for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
			
		}*/
		System.out.println(Arrays.toString(a));
		
		System.out.println("��Ԫ�ص�������"+Arrays.binarySearch(a, 3));
	}
	
	
	//ð������
	public static void sort1(int[] values){
		int temp;
		for(int i = 0;i<values.length-1;i++ ){
			for(int j = 0;j<values.length-1-i;j++){
				if(values[j]<values[j+1]){
					temp = values[j];
					values[j] = values[j+1];
					values[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(values));
	}
}
