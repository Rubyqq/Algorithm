package eightQueen;

public class eightQueen1 {
	

	public static final int rowNumber;
	
	public static void main(String...args){
		
		System.out.print("Please input your rows in the board");
		Scanner keu
		rowNumber = nextInt(System.in);
		
		int[][] board = new int[rowNumber][rowNumber];
		
		for(int i = 0; i < board.length; i++){
			for (int j = 0; j < board.length; j++){
				if(board[i][j] == 1){
					System.out.print("Q");
				}
			}
		}
	}
	
	public void showBoard(int[][] board, int rowNum){
		//stub
	}
}
