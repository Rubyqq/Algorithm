package findingLongestPath;

import java.util.ArrayDeque;
import java.util.Deque;

public class findingLongestPath {
	
	public static void main(String...args){
		int a = lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext");
		System.out.print(a);

	}
	
	public static int lengthLongestPath(String input) {
		Deque<Integer> stack = new ArrayDeque<>();
        int maxLen = 0;
        int curLen = 0;
        int numT = 0;
        int fakeT;
        int gapT;
        stack.push(0);
        stack.push(0); // in case the very first element being poped
      
        for(String s : input.split("\n")){
        	fakeT = numT; 
        	numT = s.lastIndexOf("\t") + 1; //number of "\t"
        	gapT = numT - fakeT; // consider the situation that \t is less than former one in array
        	while(gapT <= 0){ // to pop the top in order to find parent
    			stack.pop();
        		gapT++;
        	}
        	curLen = stack.peek() + s.length()-numT+1; 
        	stack.push(curLen);
        	if(s.contains(".")){ //check if it is the file
        		maxLen = Math.max(maxLen, curLen-1);
        	}
        }
        return maxLen;
    }
}
