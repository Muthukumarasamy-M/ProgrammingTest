package com.muthukumarasamy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.print("Enter the N of array : ");
		int size = mc.nextInt();

		int[][] array = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("Element " + (i) + "" + (j) + " : ");
				array[i][j] = mc.nextInt();
			}
		}
		Question3 q = new Question3();

		q.antiDiagonals(array);
	}

	public void antiDiagonals(int[][] array) {

		List<List<Integer>> list = new ArrayList<>();

		for (int i = 0, j = 0; i < array.length; i++) {

			if (i != 0)
				j = array.length - 1;

			for (; j < array.length; j++) {

				int k = j, l = i;
				List<Integer> temp = new ArrayList<>();

				while (k >= i) {
					temp.add(array[l][k]);
					k--;
					l++;
				}
				list.add(temp);
			}
		}
		System.out.println("Output : " + list);

	}

}
