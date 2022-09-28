package chess;

import boardgame.Position;

public class ChessPosition {

	private char column;
	private int row;

	public ChessPosition(char column, int row) {
		if (column < 'a' || column > 'h' || row < 1 || row > 8) {
<<<<<<< HEAD
			throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
		}
		this.column = column;
		this.row = row;
=======
			throw new ChessException("Error instantiating ChessPosition . Valid values are from a1 to h8.");
		}

		this.column = column;
		this.row = row;

>>>>>>> 5771b13262b9c8fec0d77c0e507e48f7808818d4
	}

	public char getColumn() {
		return column;
	}

	public int getRow() {
		return row;
	}

	protected Position toPosition() {
		return new Position(8 - row, column - 'a');
	}
<<<<<<< HEAD

	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char) ('a' + position.getColumn()), 8 - position.getRow());
	}

=======
	
	protected static ChessPosition fromPosition(Position position) {
		return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow() );
	}
	
>>>>>>> 5771b13262b9c8fec0d77c0e507e48f7808818d4
	@Override
	public String toString() {
		return "" + column + row;
	}
}
