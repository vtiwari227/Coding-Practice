package LeetCode;

public class ReverseLinkedList {
class ListNode {
	int val;
	ListNode next;
	public ListNode (int data) {
		this.val = data;
		next =null;
	}
}
public ListNode reverseList(ListNode head) {
    return reverseListInt(head, null);
}

public ListNode reverseListInt(ListNode head, ListNode newHead) {
    if(head == null)
        return newHead;
    ListNode next = head.next;
    head.next = newHead;
    return reverseListInt(next, head);
}

public ListNode reverseListIterative(ListNode head) {
    ListNode newHead = null;
    while(head != null){
        ListNode next = head.next;
        head.next = newHead;
        newHead = head;
        head = next;
    }
    return newHead;
}
}
