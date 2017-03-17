package AssignCookies;

import java.util.Arrays;

/**
 * Description of the question:
 * Assume you are an awesome parent and want to give your children some cookies. 
 * But, you should give each child at most one cookie. Each child i has a greed 
 * factor gi, which is the minimum size of a cookie that the child will be content with; 
 * and each cookie j has a size sj. If sj >= gi, we can assign the cookie j to the child i, 
 * and the child i will be content. Your goal is to maximize the number of your content children 
 * and output the maximum number. 
 *Note:
 *You may assume the greed factor is always positive. 
 *You cannot assign more than one cookie to one child. 
 * @author Mengyi
 *
 */

public class AssignCookies {
	
	public static void main(String...args){
		
		int [] g = {1,2};
		int [] s = {1,2,3};
		
		findContentChildren(g, s);
	}
	
	
	public static int findContentChildren(int[] g, int[] s) {  
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        
        for(int i = 0; i < g.length; i++){
            for(int j = 0; j < s.length; j++){
                if(g[i] <= s[j]){
                    s[j] = 0;
                    count++;
                    break;
                }
            }
        }
        
        return count;
    }
}
