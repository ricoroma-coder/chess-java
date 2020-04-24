package boardgame;

public class Board {
	
	protected int row;
	protected int column;
	protected Piece[][] pieces;
	
	public Board(int row, int column) {
		if (row < 1 || column < 1) {
			throw new BoardException("There must be at least 1 row and 1 column");
		}
		this.row = row;
		this.column = column;
		pieces = new Piece[row][column];
	}

	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}
	
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return this.pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return this.pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("There is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	public Piece removePiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		if (piece(position) == null)
			return null;
		Piece auxiliar = piece(position);
		auxiliar.position = null;
		pieces[position.getRow()][position.getColumn()] = null;
		return auxiliar;
	}
	
	public boolean positionExists(int row, int column) {
		return row >= 0 && row < this.row && column >= 0 && column < this.column;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	} 
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
	
	public String toString() {
		return "board row:" + this.getRow()+",board column"+this.getColumn();
	}
	
}
