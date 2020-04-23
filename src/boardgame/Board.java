package boardgame;

public class Board {
	
	protected int row;
	protected int column;
	protected Piece[][] pieces;
	
	public Board(int row, int column) {
		this.row = row;
		this.column = column;
		this.pieces = new Piece[row][column];
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
	
}
