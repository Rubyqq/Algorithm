package RemoveDuplicatesfromSortedList;

public class RemoveDuplicatesfromSortedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stub
	}
	
	public ListNode deleteDuplicates(ListNode head) {
		
	
	    if(head == null || head.next == null) return head;
	    
	    ListNode node = head;
	    while(node.next != null){
	    	if(node.val == node.next.val){
	    		node.next = node.next.next;
	    	}else{
	    		node = node.next;
	    	}
	    }
	    
	    return head;
	}

}
