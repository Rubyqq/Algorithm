package ReverseLinkedList;

public class ReverseLinkedList {
	
	public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode nextNode = head.next;
        ListNode newNode = reverseList(nextNode);
        nextNode.next = head;
        head.next = null;
        return newNode;

    }
}
