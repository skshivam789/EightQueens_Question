public class GameStrategy {
	private boolean placedQueens[][] = new boolean[8][8];
	private int numQueens = 0;

	private int getColumn(int cellId) {
		// WRITE YOUR LOGIC HERE...................................		
        int col = cellId%8;
		return col;	// just for the heck of it
	}
	
	private int getRow(int cellId) {
		// WRITE YOUR LOGIC HERE....................................
		int row = cellId/8;
		return row;	// just for the heck of it
	}

	public boolean isValidPosition(int cellId) {
		boolean isValid = true;

		if(numQueens == 8) throw new GameOverException();	// just return out of the method

		// the game is still on, so let us continue...
		
		int col = getColumn(cellId);
		
		int row = getRow(cellId);
		
		/*
			WRITE YOUR LOGIC HERE...............................

		*/
		// checking in the same row
		for(int i=0;i<=7;i++) {
			if (i!=col && placedQueens[row][i]==true) {
				isValid = false;
				break;
			}
			}
		// checking in the same column
		if(isValid==true) {
		for(int i=0;i<=7;i++) {
			if (i!=row && placedQueens[i][col]==true) {
				isValid = false;
				break;
			}
		}
		}
		// checking along the diagonal positions
		int i =row, j=col;
		if(isValid==true) {
		while(i<7&&j<7) {
			i+=1;
			j+=1;
			if (placedQueens[i][j]==true) {
				isValid = false;
				break;
			}
		}
		}
		if(isValid==true) {
		i =row; j=col;
		while(i>0&&j>0) {
			i-=1;
			j-=1;
			if (placedQueens[i][j]==true) {
				isValid = false;
				break;
			}
		}
		}
		if(isValid==true) {
		i =row; j=col;
		while(i<7&&j>0) {
			i+=1;
			j-=1;
			if (placedQueens[i][j]==true) {
				isValid = false;
				break;
			}
		}
		}
		if(isValid==true) {
		i =row; j=col;
		while(i>0&&j<7) {
			i-=1;
			j+=1;
			if (placedQueens[i][j]==true) {
				isValid = false;
				break;
			}
		}
		}
		if (isValid==true) {
			placedQueens[row][col]=true;
			numQueens+=1;
		}
		return isValid;
	}
}














