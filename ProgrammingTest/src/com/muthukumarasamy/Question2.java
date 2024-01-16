package com.muthukumarasamy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Question2 {

	public static void main(String[] args) {

		Scanner mc = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int size = mc.nextInt();

		int[] array = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Element " + (i + 1) + " : ");
			array[i] = mc.nextInt();
		}
		Question2 q = new Question2();
		q.sortFrequency(array);
	}

	private void sortFrequency(int[] array) {

		Map<Integer, Integer> map = new TreeMap<>();

		for (int i = 0; i < array.length; i++) {
			map.put(array[i], map.getOrDefault(array[i], 0) + 1);
		}
		
		int max = 0, k = 0, index = 0;
		int[] narray = new int[array.length];

		
		while (index < array.length) {

			max = 0;
			for (Integer key : map.keySet()) {
				if (map.get(key) > max) {
					max = map.get(key);
					k = key;
				} else if (map.get(key) == max) {
					if (key < k) {
						max = map.get(key);
						k = key;
					}
				}
			}
			arrayfill(narray, index, k, max);
			map.remove(k);
			index += max;
		}
		
		System.out.println("\nOutput is : " + Arrays.toString(narray));
	}

	private void arrayfill(int[] array, int index, int k, int max) {
		int start = 0;
		while (start < max && index < array.length) {
			array[index++] = k;
		}
	}
}
