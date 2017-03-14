package queenBacktracking;

import java.util.Scanner;

public class queenBacktracking {
	
	public static void main (String [] args){
		System.out.println("Please input the rows of board you want:");
		Scanner keyboard = new Scanner(System.in);
		int input = keyboard.nextInt();
		int [][] board = new int [input][input];
		queenBacktracking qbt = new queenBacktracking();
		if (!qbt.checkEachRowOnBoard(board, 0)) {
			System.out.println("No solution !!!");
		}
		qbt.printTheBoard(board);
	}
	
	public  void printTheBoard(int board [][]){
		for(int i = 0; i < board.length; i++){
			for(int j=0; j < board.length; j++){
				if(board[i][j] == 1){
					System.out.print("queen\t");
				}
				else{
					System.out.print("-\t");
				}
			}
			System.out.println("\n");
		}
	}
	
	public boolean ifQueenAttack(int board[][], int row, int col){
		int i, j;
		
		for(i = 0; i < row; i++){
			if(board[i][col] == 1){
				return false;
			}
		}
		for(i = row, j = col; i >= 0 && j < board.length; i--, j++){
			if(board[i][j] == 1){
				return false;
			}
		}
		for(i = row, j = col; i >= 0 && j >= 0; i--, j--){
			if(board[i][j] == 1){
				return false;
			}
		}
		return true;
	}
	
	public boolean checkEachRowOnBoard(int board[][], int row){
		if(row >= board.length){
			return true;
		}
		for(int i = 0; i < board.length; i++){
			if(ifQueenAttack(board, row, i)){
				board[row][i] = 1; 
				if(checkEachRowOnBoard(board, row + 1)){
					return true;
				}
				board[row][i] = 0;
			}
		}
		return false;
	}
	
}
