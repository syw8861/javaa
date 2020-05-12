package com.yedam.classes;

public class gugudan {
	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			if (i < 2) {
				System.out.print("[" + i + "]" + "단");
			}
		}

		int i = 1;
		for (int j = 1; j < 10; j++) {
//				if (j > i) {
//					System.out.println();
			if (j > 1) {
				System.out.print(i + "*" + j + "=" + (i * j) + " ");
			}
			i++;
			System.out.println();
		}

	}
}
