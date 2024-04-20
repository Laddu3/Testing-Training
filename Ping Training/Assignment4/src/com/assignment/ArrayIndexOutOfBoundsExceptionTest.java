package com.assignment;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many elements in the array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter array elents");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter array index");
		int index=sc.nextInt();
		try {
			System.out.println(index+" Index of element is "+arr[index]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("please enter the index between 0 to "+(size-1));
		}
		catch (Exception e) {
			
		}
		System.out.println("Endf of the main");
		sc.close();

	}

}
