package boardgame;

public class Position {
	protected int row;
	protected int column;
	
	public Position() {
		
	}
	
	public Position(int row, int column) {
		this.setRow(row);
		this.setColumn(column);
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
	
	@Override
	public String toString() {
		return this.getRow() + ", " + this.getColumn();
	}
}
