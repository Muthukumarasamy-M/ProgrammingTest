package com.muthukumarasamy;

import java.util.Scanner;

public class Question4 {
	static Scanner mc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Enter the Turn Around Time : ");
		int turn = mc.nextInt();

		System.out.println("Number of Trains from A->B :  ");
		int NA = mc.nextInt();
		System.out.println("Number of Trains from A->B :  ");
		int NB = mc.nextInt();
		mc.nextLine();

		Question4 q = new Question4();

		System.out.println("Enter timings of A->B");
		String[][] time1 = q.getValues(NA);

		
		System.out.println("Enter timings of B->A");
		String[][] time2 = q.getValues(NB);

		if (NB == 0 || NA == 0)
			print(NA, NB);
		else {
			int na = q.find(time1, time2, NA, turn);
			int nb = q.find(time2, time1, NB, turn);
			print(na, nb);

		}
	}

	private static void print(int NA, int NB) {

		System.out.println("Total trains needed station A: " + NA);
		System.out.println("Total trains needed station B: " + NB);

	}

	public String[][] getValues(int size) {

		String[][] time = new String[size][2];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < 2; j++)
				time[i][j] = mc.nextLine();
		}
		return time;
	}

	private int find(String[][] time1, String[][] time2, int nA, int turn) {

		for (int i = 0; i < time1.length; i++) {

			for (int j = 0; j < time2.length; j++) {

				int arrivalhour = Integer.parseInt(time1[i][0].substring(0, 2));
				int departurehour = Integer.parseInt(time2[j][1].substring(0, 2));
				if (arrivalhour > departurehour) {
					nA--;
				} else if (arrivalhour == departurehour) {
					int arraivalmin = Integer.parseInt(time1[i][0].substring(3));
					int departuremin = Integer.parseInt(time2[j][1].substring(3)) + turn;
					if (arraivalmin > departuremin)
						nA--;
				}
				System.out.println(arrivalhour + " "+departurehour+ " "+nA) ;
			}
		}
		return nA;
	}
}
