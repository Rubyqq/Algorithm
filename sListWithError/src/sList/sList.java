package sList;

import cs61B3.SListNode;

public class sList {
	private sListNode head;
	private int size;
	
	
	sList(){
		head = null;
		size = 0;
	}
	
	public int listLength(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void insertFront(int number){
		head = new sListNode(number, head);
		size++;
	}
	
	 public void insertEnd(int obj) {
		    if (head == null) {
		      head = new sListNode(obj);
		    } else {
//		      SListNode node = head;
//		      while (node.next != null) {
//		        node = node.next;
//		      }
//		      node.next = new SListNode(obj);
		    	head.next = new sListNode(obj);
		    	head = head.next; //why this is not correct? Since sList start from head when we create the constructor. If the head was changed from start to other point, the sList will start to construct from the head place.
		    	//why not head = new sListNode(obj)? Since writing this way the former head.next pointer will point to nothing and the sList will broken.
		    	
		    }
		    size++;
		  }
	
	public int listPosition(int position){
		if(head == null || position < 1){
			return 0;
		}
		else{
			sListNode curnode = head;
			while(position > 1){
				if(curnode == null){
					return 0;
				}
				curnode = curnode.next;
				position--;
			}
			return curnode.item;
		}
	}
	
	public String toString(){
		String result = "[ ";
		sListNode num = head;
		while(num != null){
			result = result + num.item + " ";
			num = num.next;
		
		}
		result = result + "]";
		return result;
	}
	
	public static void main(String [] args){
		sList s= new sList();
		sList y = new sList();
		System.out.println(s.toString());
		System.out.println(s.isEmpty());
		System.out.println("--------------------------------------");
		s.insertEnd(3);
		s.insertEnd(5);
		s.insertEnd(9);
		System.out.println(s.toString());
		System.out.println(s.isEmpty());
		System.out.println(s.listLength());
		System.out.println(s.listPosition(2));
		System.out.println("--------------------------------------");
		y.insertFront(2);
		y.insertFront(5);
		y.insertFront(9);
		System.out.println(y.toString());
		System.out.println(y.isEmpty());
		System.out.println(y.listLength());
		System.out.println(y.listPosition(2));
		
	}
}
