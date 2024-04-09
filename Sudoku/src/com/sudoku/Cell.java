package com.sudoku;

public class Cell {
	
	//Unchanging values unique to each cell:
	private int id;
	private int row;
	private int column;
	private int block;
	
	//Changing Values:
	private int value;
	private int[] potential = new int[]{1,2,3,4,5,6,7,8,9};
	boolean solved = false;
	
	public Cell(int id, int row, int column, int block, int value) {
		super();
		this.id = id;
		this.column = column;
		this.row = row;
		this.block = block;
		this.value = value;
		if (value > 0) {
			solved = true;
		}
		if (solved == true) {
			for(int i=0; i<9; i++) {
				potential[i] = 0;
			}
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	public int getBlock() {
		return block;
	}
	public void setBlock(int block) {
		this.block = block;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
		if (value > 0) {
			solved = true;
		} else {
			solved = false;
		}
	}
	public int[] getPotential() {
		return potential;
	}
	public void setPotential(int[] potential) {
		this.potential = potential;
	}
	public boolean isSolved() {
		return solved;
	}
	public void setSolved(boolean solved) {
		this.solved = solved;
	}
	

}
