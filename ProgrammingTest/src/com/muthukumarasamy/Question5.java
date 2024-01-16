package com.muthukumarasamy;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.print("Enter the row of array : ");
		int row = mc.nextInt();
		System.out.print("Enter the col of array : ");
		int col = mc.nextInt();

		int[][] array = new int[row][col];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("Element " + (i) + "" + (j) + " : ");
				array[i][j] = mc.nextInt();
			}
		}
		Question5 q = new Question5();
		q.rectangle(array);
	}

	private void rectangle(int[][] array) {

		int rectangle = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				
				if (j + 1 < array[0].length && i + 1 < array.length) {
					
					if (array[i][j] == 1 && array[i + 1][j + 1] == 1 && array[i + 1][j] == 1 && array[i][j + 1] == 1) {
						rectangle++;
					}
				}
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Number of Rectangles filled with one : " + rectangle);
	}
}
