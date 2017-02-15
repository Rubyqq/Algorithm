package sList;

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
	
	public void insertEnd(int number){
		if(head == null){
			head = new sListNode(number);
		}else{
			sListNode node = head;
			while(node.next != null){
				node = node.next;
			}
			node.next = new sListNode(number);
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
