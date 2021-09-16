// pattern Singleton


public class ChessBoard2 {
	
	// criar instancia única com private
	static private ChessBoard2 instance =  new ChessBoard();
	
	private ChessBoard() {}
	static ChessBoard2 getInstance () {return instance;}
	
	public static void main(String args[])
	{
		ChessBoard2 tabuleiro = ChessBoard2.getInstance();
	}
}
