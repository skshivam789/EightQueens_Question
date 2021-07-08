public class ChessBoardRenderer {
	public boolean isBlackSquare(int square) {

		// WRITE YOUR LOGIC HERE...
		int a = square/8;
		int b = square%8;
		if((a%2==0 && b%2!=0)||(a%2!=0 && b%2==0))
			return true;
		else
			return false;		
		
	}
}
