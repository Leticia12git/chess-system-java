package chess;

import boardgame.Board;
<<<<<<< HEAD
import boardgame.Piece;
import boardgame.Position;
=======
>>>>>>> 5771b13262b9c8fec0d77c0e507e48f7808818d4
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}

		return mat;
	}
	private void placeNewPiece(char column, int row, ChessPiece piece) {
		board.placePiece(piece, new ChessPosition(column, row).toPosition());
	}
	
	public boolean [][] possibleMoves(ChessPosition sourcePosition){
		Position position = sourcePosition.toPosition();
		validateSourcePosition(position);
		return board.piece(position).possibleMoves();
	}

	public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
		Position source = sourcePosition.toPosition();
		Position target = targetPosition.toPosition();
		validateSourcePosition(source);
		validateTargetPosition(source, target);
		Piece capturedPiece = makeMove(source, target);
		return (ChessPiece) capturedPiece;
	}

	private void validateTargetPosition(Position source, Position target) {
		// TODO Auto-generated method stub
		
	}

	private Piece makeMove(Position source, Position target) {
		Piece p = board.removePiece(source);
		Piece capturedPiece = board.removePiece(target);
		board.placePiece(p, target);
		return capturedPiece;
	}

	private void validateSourcePosition(Position position) {
		if (!board.thereIsPiece(position)) {
			throw new ChessException("There is no piece on source position");
		}
		
		private void validateTargetPosition(Position source, Position target) {
			if(!board.piece(source).possibleMoves(target)) {
				throw new ChessException("The chosen piece can't move to target position ");
			}
		}
		
		if(board.piece(position).isThereAnyPossibleMove()) {
			throw new ChessException("There is no possible moves for the chosen piece");
		}
	}

	private void initialSetup() {
<<<<<<< HEAD

		placeNewPiece('a', 1, new Rook(board, Color.WHITE));
		placeNewPiece('e', 1, new King(board, Color.WHITE));
		placeNewPiece('h', 1, new Rook(board, Color.WHITE));
		placeNewPiece('a', 8, new Rook(board, Color.BLACK));
		placeNewPiece('e', 8, new King(board, Color.BLACK));
		placeNewPiece('h', 8, new Rook(board, Color.BLACK));

=======
		placeNewPiece('b', 6, new Rook  (board, Color.WHITE));
		placeNewPiece('e', 8, new King (board, Color.BLACK));
		placeNewPiece('e', 1, new King (board, Color.WHITE));
>>>>>>> 5771b13262b9c8fec0d77c0e507e48f7808818d4
	}
}
