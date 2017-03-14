package IslandPerimeter;

public class IslandPerimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] grid = {{0,1,0,0},
		            	 {1,1,1,0},
		            	 {0,1,0,0},
		            	 {1,1,0,0}};
		
		islandPerimeter(grid);
	}
	
//	[[0,1,0,0],
//	 [1,1,1,0],
//	 [0,1,0,0],
//	 [1,1,0,0]]

	public static void islandPerimeter(int[][] grid) {
		int count = 0;
        for(int i = 0; i < grid.length; i++){
        	for(int j = 0; j < grid[i].length; j++){
        		if(grid[i][j] == 1) count += 4;
        		count -= helper(grid, i, j);
        	}
        }
        System.out.print(count);
	}
	
	public static int helper(int[][] grid, int row, int col){
		
		int count = 0;
		
		if(row > 0 && grid[row][col] == grid[row-1][col] && grid[row-1][col] == 1){
			count += 1;
		}
		
		if(row < grid.length-1 && grid[row][col] == grid[row+1][col] && grid[row+1][col] == 1){
			count += 1;
		}
		
		if(col > 0 && grid[row][col] == grid[row][col-1] && grid[row][col-1] == 1){
			count += 1;
		}
		
		if(col < grid[row].length-1 && grid[row][col] == grid[row][col+1] && grid[row][col+1] == 1){
			count += 1;
		}
		
		return count;
	}
	

}
