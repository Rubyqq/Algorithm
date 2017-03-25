package NumberofBoomerangs;

import java.util.HashMap;

/**
 * Description of the question
 * 
 * Given n points in the plane that are all pairwise distinct, a "boomerang" 
 * is a tuple of points (i, j, k) such that the distance between i and j equals 
 * the distance between i and k (the order of the tuple matters).
 * Find the number of boomerangs. You may assume that n will be at most 500 
 * and coordinates of points are all in the range [-10000, 10000] (inclusive).
 * 
 * Example:
 * Input:
 * [[0,0],[1,0],[2,0]]
 * 
 * Output:
 * 2
 * 
 * Explanation:
 * The two boomerangs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 * @author Mengyi
 *
 */

public class NumberofBoomerangs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stub
	}
	
	public int numberOfBoomerangs(int[][] points) {
		
		int dis = 0;
		int res = 0;
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		
        for(int i = 0; i < points.length; i++){
        	for(int j = 0; j < points.length; j++){
        	    
        	    if(i == j)
                continue;

        		dis = distance(points[i], points[j]);
        		hash.put(dis, hash.getOrDefault(dis, 0)+1);
        	}
        	
        	for(int num : hash.values()){
        	    res += num*(num-1);
            }
            
            hash.clear();
        }
        
        return res;
       
    }
    
    public int distance(int[]x, int[]y){
        return (x[0]-y[0])*(x[0]-y[0]) + (x[1]-y[1])*(x[1]-y[1]);
    }

}
