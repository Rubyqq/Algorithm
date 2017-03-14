package NestedListWS;

import java.util.ArrayList;
import java.util.LinkedList;

public class NestedListWS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * the interface is given by leetcode
	 * @author Mengyi
	 *
	 */
	  // This is the interface that allows for creating nested lists.
	  // You should not implement it, or speculate about its implementation
	  public interface NestedInteger {
	 
	      // @return true if this NestedInteger holds a single integer, rather than a nested list.
	      public boolean isInteger();
	 
	      // @return the single integer that this NestedInteger holds, if it holds a single integer
	      // Return null if this NestedInteger holds a nested list
	      public Integer getInteger();
	 
	      // @return the nested list that this NestedInteger holds, if it holds a nested list
	      // Return null if this NestedInteger holds a single integer
	      public LinkedList<NestedInteger> getList();
	  }
	 
	
	  public int depthSum(LinkedList<NestedInteger> nestedList) {
	        
	        int level = 1; 
	        int total = 0;
	        
	        while(nestedList.size() != 0){
	        
	            LinkedList<NestedInteger> newList = new LinkedList<NestedInteger>();
	            
	            for(NestedInteger ni : nestedList){
	                if(ni.isInteger()){
	                    total += ni.getInteger() * level;
	                }else{
	                    newList.addAll(ni.getList()); 
	                }
	            }
	            
	            nestedList = newList;
	            level++;
	        }
	        
	        return total;
	    }

}
	

