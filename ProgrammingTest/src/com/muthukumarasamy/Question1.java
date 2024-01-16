package com.muthukumarasamy;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = mc.nextInt();

		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Element " + (i + 1) + " : ");
			array[i] = mc.nextInt();

		}
		Question1 q = new Question1();
		q.replaceZeros(array);
	}

	private void replaceZeros(int[] array) {

		int start = 0, end = array.length, index = 0;
		while (start < end) {

			if (array[start] != 0) {
				int temp = array[start];
				array[start] = array[index];
				array[index] = temp;
				index++;
			}
			start++;

		}
		System.out.println(Arrays.toString(array));

	}

}
