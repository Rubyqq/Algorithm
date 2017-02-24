package MovingAverage;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
	
	int maxSize;
	double curValue = 0.0;
	Queue <Integer> curwindow;
	
    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        curwindow = new LinkedList<Integer>(); 
        maxSize = size;
    }
    
    public double next(int val) {
        if(curwindow.size()+1 <= maxSize){
        }else{
        	curValue = curValue - curwindow.remove();
        }
        curwindow.add(val);
    	curValue = curValue + val;
    	double average = curValue/curwindow.size();
    	return average;
    }
    
    public static void main(String[] args){
    	MovingAverage obj = new MovingAverage(3);
//    	obj.next(2);
//    	obj.next(6);
//    	obj.next(3);
    	System.out.print(obj.next(4));
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */