package com.yedam.collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardMain
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		List<Board> list = new ArrayList<>();
		
		BoardService service = new BoardServiceImpl();

		while (true)
		{
		System.out.println("=======================");
		System.out.println("1.입력 2.수정 3.삭제 4.리스트");
		System.out.println("=======================");
		int menu = scn.nextInt();
		
			if (menu == 1)
			{
				System.out.println("제목입력");
				String title = scn.nextLine();
				scn.nextLine();
				System.out.println("내용입력");
				String content = scn.nextLine();
				System.out.println("작성자입력");
				String writer = scn.nextLine();

				Board board = new Board(title, content, writer);
				service.insertBoard(list, board);
				
			}
			if (menu == 2)
			{
				System.out.println("수정할 제목 입력");
				String title = scn.nextLine();
				scn.nextLine();
				System.out.println("내용 입력");
				String content = scn.nextLine();
				scn.nextLine();
				System.out.println("작성자입력");
				String writer = scn.nextLine();

				Board board = new Board(title, content, writer);
				service.updateBoard(list, board);
			
			}
			if (menu == 3)
			{
				System.out.println("삭제 할 제목 입력");
				String title = scn.nextLine();
				service.removeBoard(list, title);
			

			}
			if (menu == 4)
			{
				service.listBoard(list);
			
			}
		}

	}
}
