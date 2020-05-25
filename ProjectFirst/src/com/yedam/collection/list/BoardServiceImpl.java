package com.yedam.collection.list;

import java.util.List;

public class BoardServiceImpl implements BoardService
{

	@Override
	public void insertBoard(List<Board> list, Board board)
	{
		list.add(board);
	}
	
	@Override
	public void listBoard(List<Board> list)
	{
		for (Board board1 : list)
		{
			if (board1 != null)
				System.out.println(board1.toString());
		}
	}

	@Override
	public void removeBoard(List<Board> list, String title)
	{
		for (Board board1 : list)
		{
			if (board1.title.equals(title))
			{
				list.remove(board1);
			}
		}
	}

	@Override
	public void updateBoard(List<Board> list, Board board)
	{
		for (Board board1 : list)
		{
			if (board1.title.equals(board.title))
			{
				board1.title = board.title;
				board1.content = board.content;
				board1.writer = board.writer;
			}
		}
	}
}
