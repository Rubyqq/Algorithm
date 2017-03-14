package linkedList;

public class lLNode {
	public int data;
	public lLNode next;
	
	public lLNode(int data, lLNode next){
		this.data = data;
		this.next = next;
	}
	
	public lLNode(int data){
		this(data, null);
	}
	
	public void insertAfter(int number){
		next = new lLNode(number, next);
	}
	
	public lLNode nth(int position){
		if(position == 1){
			return this;
		}
		else if((position < 1) || (next == null)){
			return null;
		}else {
			return next.nth(position-1);
		}
	}
}
