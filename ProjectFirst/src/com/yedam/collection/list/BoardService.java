package com.yedam.collection.list;



import java.util.List;
public interface BoardService
{
		void insertBoard(List<Board> list, Board board);
		void listBoard(List<Board> list);
		void removeBoard(List<Board> list, String title);
		void updateBoard(List<Board> list, Board board);
}
