package com.yedam.classes.statics;

import java.util.Scanner;

public class Accountexample {
	public static void main(String[] args) {
		Account[] accounts = new Account[100];
		Scanner scn = new Scanner(System.in);
		while (true) {
			System.out.println("====================");
			System.out.println("1.계좌생성  2.계좌목목  3.예금  4.출금  5.종료");
			System.out.println("====================");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {
				System.out.println("계좌생성 선택.");
				System.out.println("계좌번호를 입력하세요");
				String ano = scn.nextLine(); // 문자열입력 방법 nextint은 숫자
				System.out.println("예금주 입력하세요");
				String owner = scn.nextLine();
				System.out.println("금액을 입력하세요");
				int balance = scn.nextInt();
				Account acnt = new Account(ano, owner, balance);
				for (int i = 0; i < accounts.length; i++) {
					if (accounts[i] == null) {
						accounts[i] = acnt;
						break;
					}
				}
				System.out.println("계좌가 생성되었습니다.");
			} else if (menu == 2) {
				System.out.println("계좌목목 선택");

				for (Account acc : accounts) {
					if (acc != null) { // 전체 배열중에 값이 있는 경우에만 출력(null제외)
						System.out.println("계좌번호는 = " + acc.getAno() + "예금주:" + acc.getOwner() + "잔액:" + acc.getBalance());
					}
				}
			} else if (menu == 3) {
				System.out.println("예금 선택");
				System.out.println("계좌번호를 입력하세요");
				String ano = scn.nextLine();
				System.out.println("예금액 입력하세요");
				int balance = scn.nextInt();
				//전체 배열중에 값이 있는 경우 && 입력계좌번호와 동일한 건에 처리.
				for (Account acc : accounts) {
					if (acc != null && acc.getAno().equals(ano)) {
						int result = acc.getBalance();
						acc.setBalance(result + balance);
					}
				}
				System.out.println("예금처리가 되었습니다");
			} else if (menu == 4) {
				System.out.println("출금 선택");
				System.out.println("계좌번호를 입력하세요");
				String ano = scn.nextLine();
				System.out.println("출금액 입력하세요");
				int balance = scn.nextInt();
				//전체 배열중에 값이 있는 경우 && 입력계좌번호와 동일한 건에 처리.
				for (Account acc : accounts) {
					if (acc != null && acc.getAno().equals(ano)) {
						int result = acc.getBalance();
						acc.setBalance(result - balance);
					}
				}
				System.out.println("출금처리가 되었습니다");
			} else if (menu == 5) {
				System.out.println("종료선택.");
				break;
			}
		} // end while
		System.out.println("종료");
	}// end of main
}// end of class
