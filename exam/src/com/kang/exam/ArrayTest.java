package com.kang.exam;

public class ArrayTest {
	
	public static void main(String[] args) {
		int[] array = {4, 5, 10, 22, 80, 11};
		
		printArrayValue(array);

		String[] array3 = new String[3];
		
		printArrayValue(array3);

	}
	
	public static void printArrayValue(String[] arr) {
		for(String str : arr) {
			System.out.println(str);
		}
	}
	
	public static void printArrayValue(int[] array) {
		int sum = 0;
		/*
		for(i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			sum = sum + array[i];
		}
		*/
		for(int str : array) {
			System.out.println(str);
			sum = sum + str;
		}
		System.out.println("합계 : " + sum + "입니다.");
		System.out.printf("합계 : %d입니다. \n", sum);
	}
}
