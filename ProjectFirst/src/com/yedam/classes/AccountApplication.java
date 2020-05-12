package com.yedam.classes;

import java.util.Scanner;

import com.yedam.classes.statics.Account;

public class AccountApplication {
	private Scanner scn = new Scanner(System.in);// cntl+shift+ o(영어 o) 누르면 스캐너임폴트 알아서 해줌
	private Account[] accounts = new Account[100]; // 생성자(default)

	private void createAccount() {// 1.계좌생성
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
	}

	private void accountList() {// 2.계좌목록

		System.out.println("계좌목목 선택");
		for (Account acc : accounts) {
			if (acc != null) { // 전체 배열중에 값이 있는 경우에만 출력(null제외)
				System.out.println("계좌번호는 = " + acc.getAno() + "   예금주:" + acc.getOwner() + "   잔액:" + acc.getBalance());
			}
		}
	}

	// 3.입금
	private void deposit() {
		System.out.println("예금 선택");
		System.out.println("계좌번호를 입력하세요");
		String ano = scn.nextLine();
		System.out.println("예금액 입력하세요");
		int balance = scn.nextInt();
		// 전체 배열중에 값이 있는 경우 && 입력계좌번호와 동일한 건에 처리.
//		for (Account acc : accounts) {
//			if (acc != null && acc.getAno().equals(ano)) {
//				int result = acc.getBalance();
//				acc.setBalance(result + balance);
//			}
//		}
		Account acnt = findAccount(ano);
		if (acnt != null) {
		acnt.setBalance(acnt.getBalance() + balance);
		System.out.println("예금처리가 되었습니다");
		}else{
			System.out.println("계좌가 없습니다");
		}
	}

	// 4.출금
	private void withdraw() {
		System.out.println("출금 선택");
		System.out.println("계좌번호를 입력하세요");
		String ano = scn.nextLine();
		System.out.println("출금액 입력하세요");
		int balance = scn.nextInt();
		// 전체 배열중에 값이 있는 경우 && 입력계좌번호와 동일한 건에 처리.
//		for (Account acc : accounts) {
//			if (acc != null && acc.getAno().equals(ano)) {
//				int result = acc.getBalance();
//				acc.setBalance(result - balance);
//			}
//		}
		Account acnt = findAccount(ano);
		if (acnt != null) {
			acnt.setBalance(acnt.getBalance() - balance);
			System.out.println("출금처리가 되었습니다");
		} else {
			System.out.println("해당계좌가 없습니다");
		}
	}

	// 6.계좌번호(ano)입력하면 해당 Account를 반환해주는 메소드
	// 5.종료
	private Account findAccount(String ano) {
		for (Account acc : accounts) {
			if (acc != null && acc.getAno().equals(ano)) {
				return acc;
			}
		}
		return null;
	}

	public void execute() { // 메인메소드 역할
		while (true) {
			System.out.println("====================");
			System.out.println("1.계좌생성  2.계좌목목  3.예금  4.출금  5.종료");
			System.out.println("====================");
			System.out.println("선택 > ");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) { // 1.계좌생성
				createAccount();
			} else if (menu == 2) {// 2.계좌목록
				accountList();
			} else if (menu == 3) {// 3.예금
				deposit();
			} else if (menu == 4) {// 4.출금
				withdraw();
			} else if (menu == 5) {// 5.종료
				System.out.println("종료");
				break;
			}
		} // end while
	}

}
