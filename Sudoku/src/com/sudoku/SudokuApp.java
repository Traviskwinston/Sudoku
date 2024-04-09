package com.sudoku;

import java.util.ArrayList;

//Program to solve a sodku using the same methods a human would instead of trying all combinations.
public class SudokuApp {

	public static void main(String[] args) {
		System.out.println("Sudoku Solver 3000");
		
		SudokuServices ss = new SudokuServices();
		ArrayList<Cell> cellArray = new ArrayList<>();
		
		cellArray = ss.PopulateCells();
		
		ss.ViewGrid(cellArray);
		System.out.println("Done");	
	}

}
