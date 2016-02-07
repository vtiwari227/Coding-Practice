package LeetCode;
import LeetCode.ListNode;
public class RemoveNthLastElement {
	// Method for removing Nth from last 
	public ListNode removeNthFromEnd(ListNode head, int n){
		ListNode newHead = new ListNode(0);
		newHead.next = head;
		ListNode slow = newHead;
		ListNode fast = newHead;
		for(int i =1;i<=n+1;i++){
			fast= fast.next;
		
		}
		while(fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return newHead.next;
}

}