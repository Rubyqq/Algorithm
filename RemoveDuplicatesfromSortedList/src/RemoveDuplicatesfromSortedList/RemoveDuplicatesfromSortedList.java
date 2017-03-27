package RemoveDuplicatesfromSortedList;

/**
 * Description of the question
 * 
 * Given a sorted linked list, delete all duplicates such that each element appear only once. 
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3. 
 * 
 * @author Mengyi
 *
 */

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
