package com.yedam.classes;

import java.util.Scanner;

public class Freinds {
	private Freind[] freindsinfo = new Freind[100];
	private Scanner scn = new Scanner(System.in);
	

	
	public void execute() { // 메인메소드 역할
		while (true) {
			System.out.println("====================");
			System.out.println("1.친구등록  2.친구목록  3.조회  4.종료 ");
			System.out.println("====================");
			System.out.println("선택 > ");
			int menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) { // 1.친구목록생성
				createfreind();
			} else if (menu == 2) {// 2.목록
				addressList();
			} else if (menu == 3) {// 2.친구내용출력
				freindinfo();
			} else if (menu == 4) {// 4.종료
				System.out.println("종료");
				break;
			}
		}
	}
	
	private void createfreind() {
		System.out.println("1.친구 2.대학 3.회사");
		int menu = scn.nextInt(); scn.nextLine();
		String department = null;
		String phoneNumber = null;
		String fname = null;
		String major = null;
		if (menu == 1) {
			System.out.println("이름을 입력");
			fname = scn.nextLine();
			System.out.println("폰번호를 입력");
			phoneNumber = scn.nextLine();

		} else if (menu == 2) {
			System.out.println("이름입력");
			fname = scn.nextLine();
			System.out.println("폰번호를 입력");
			phoneNumber = scn.nextLine();
			System.out.println("전공 입력");
			major = scn.nextLine();
		} else if (menu == 3) {
			System.out.println("이름입력");
			fname = scn.nextLine();
			System.out.println("폰번호를 입력");
			phoneNumber = scn.nextLine();
			System.out.println("부서 입력");
			department = scn.nextLine();

			if (menu == 1) {
				Freind fd = new Freind(fname, phoneNumber);
				for (int i = 0; i < freindsinfo.length; i++) {
					if (freindsinfo[i] == null) {
						freindsinfo[i] = fd;
						break;
					}
				}
			} else if (menu == 2) {
				UFreind uf = new UFreind(fname, phoneNumber, major);
				for (int i = 0; i < freindsinfo.length; i++) {
					if (freindsinfo[i] == null) {
						freindsinfo[i] = uf;
						break;
					}
				}
			} else if (menu == 3) {
				CFreind cf = new CFreind(fname, phoneNumber, department);
				for (int i = 0; i < freindsinfo.length; i++) {
					if (freindsinfo[i] == null) {
						freindsinfo[i] = cf;
						break;
					}
				}
			}
		}
	}
	void freindinfo() {
		System.out.println("조회할 친구이름");
		System.out.println("조회할 이름 입력:");
		String name = scn.nextLine();
		for(Freind fdi : freindsinfo) {
			if(fdi != null && fdi.getFname().equals(name)) {
				fdi.showInfo();
			}
		}
	}
	public void addressList(){
		System.out.println("친구목록");
		for(Freind fnd : freindsinfo) {
			if(fnd != null ) {
				fnd.showInfo();
			}			
		}
	}
}