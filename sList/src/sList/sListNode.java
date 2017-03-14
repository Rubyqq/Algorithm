package sList;

public class sListNode {
	int item;
	sListNode next;
	
	public sListNode(int item, sListNode next){
		this.item = item;
		this.next = next;
	}
	
	sListNode(int item){
		this(item, null);
	}
	
}
