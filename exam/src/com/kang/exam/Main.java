package com.kang.exam;

public class Main {
	public static void main(String[] args)
	{
		printStar(5);
	}

	public static void printStar(int line)
	{
		int i;
		int j;
		
		for(i = 1; i <= line; i++)
		{
			for(j = 0; j < i; j++)
			{
				System.out.printf("*");
			}
			System.out.printf("\n");
		}
	}
}
