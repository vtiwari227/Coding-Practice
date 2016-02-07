package LeetCode;
 // A Linked List Node representation
class ListNode {
	int data;
	ListNode next;
	public ListNode(int data){
		this.data = data;
		this.next = null;
	}
}

public class Merge2LinkedList {
	ListNode head;

	// Method to merge two sorted List
	public ListNode mergetwoLists(ListNode l1, ListNode l2){
		ListNode mergeHead = new ListNode(0) ;
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1 == null && l2 == null) return	 null;
		if(l1.data < l2.data){
			mergeHead = l1;
			mergeHead.next = mergetwoLists(l1.next,l2);
		}
		if(l2.data < l1.data){
			mergeHead = l2;
			mergeHead.next = mergetwoLists(l1,l2.next);
		}
		return mergeHead;
 	}
}
