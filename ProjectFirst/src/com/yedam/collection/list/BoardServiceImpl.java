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
		for(int i=0; i<list.size(); i++)
		{
			if(list.get(i).getTitle().equals(title)) 
		    {
				list.remove(i);
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
				//for(int i=0; i<list.size(); i++)
//				{
//					if(list.get(i).getTitle().equals(board.getTitle())
//					{
//					   list.get(i).serContent(board.getContent());
//					}
//				}
				
				
			}
		}
	}
}
