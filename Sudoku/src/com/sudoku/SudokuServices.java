package com.sudoku;

import java.util.ArrayList;

public class SudokuServices {
	
	public int[][] GenerateBoard() {
		int [][] board = {
				{7, 0, 2, 0, 5, 0, 6, 0, 0},
				{0, 0, 0, 0, 0, 3, 0, 0, 0},
				{1, 0, 0, 0, 0, 9, 5, 0, 0},
				{8, 0, 0, 0, 0, 0, 0, 9, 0},
				{0, 4, 3, 0, 0, 0, 7, 5, 0},
				{0, 9, 0, 0, 0, 0, 0, 0, 8},
				{0, 0, 9, 7, 0, 0, 0, 0, 5},
				{0, 0, 0, 2, 0, 0, 0, 0, 0},
				{0, 0, 7, 0, 4, 0, 2, 0, 3},
		};
		return board;
	}
	
	public ArrayList<Cell> PopulateCells() {
		ArrayList<Cell> cellArray = new ArrayList<>();
		int[][] board = GenerateBoard();
		int id = 1;
		while(id < 81) {
			for (int row=1; row<=9; row++) {
				for (int column=1; column<=9; column++) {
					int block = assignBlock(id);
					Cell cell = new Cell(id, row, column, block, board[row-1][column-1]);
					cellArray.add(cell);
					id++;
				}
			}
		}
		return cellArray;
	}
	
	public int assignBlock(int id) {
		int row = (id-1) / 9;
		int column = (id - 1) % 9;
		
		int blockRow = row / 3;
		int blockColumn = column / 3;
		return blockRow * 3 + blockColumn + 1;
		
	}

	public void ViewGrid(ArrayList<Cell> board) {
		System.out.print("-------------------------------\n");
		for (int i=0;i<81;i++) {
			if (i%3==0 && i!=0) {
				System.out.print("|");
			}
			if (i%9==0 && i!=0) {
				System.out.println();
			}
			if (i%9==0 && i!=27 && i != 54) {
				System.out.print("|");
			}
			if (i == 27 || i== 54) {
				System.out.print("-------------------------------\n|");
			}
			System.out.print(" ");
			System.out.print(board.get(i).getValue()+" ");
			if (i==80) {
				System.out.println("|" + "\n-------------------------------");
			}
		}
	}

}
