package chess;

<<<<<<< HEAD
import boardgame.BoardException;

public class ChessException  extends BoardException{

		private static final long serialVersionUID = 1L;

		public ChessException(String msg) {
			super(msg);
		}
=======
public class ChessException  extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public ChessException(String msg) {
		super(msg);
	}
>>>>>>> 5771b13262b9c8fec0d77c0e507e48f7808818d4
}
