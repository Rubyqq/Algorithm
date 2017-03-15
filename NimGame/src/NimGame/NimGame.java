package NimGame;

/**
 * Nim Game: You are playing the following Nim Game with your friend: There is a heap of stones on the table, each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner. You will take the first turn to remove the stones. 
Both of you are very clever and have optimal strategies for the game. Write a function to determine whether you can win the game given the number of stones in the heap. 
For example, if there are 4 stones in the heap, then you will never win the game: no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend. 

 * Explanation of this question: In the game if the heap has 4 stones. I will lose the game. If the heap has 5 stones I will win since 
 * I can take one and my partner no matter how many she take, I will have a chance to take the last one. Same case will happen if the heap
 * has 6 or 7 stones. But if the heap has 8 stones, I will lose. I can win if to the very end 4 stones left and at that time my partner takes
 * the turn. Therefore, if I want to win, I need to win in every four-stone sub-round. Since the game starts from me first, the number of the 
 * stone should not divided by 4.
 * @author Mengyi
 *
 */

public class NimGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		canWinNim(18);
	}
	
	 public static boolean canWinNim(int n) {
	        return n % 4 != 0;
	 }

}
