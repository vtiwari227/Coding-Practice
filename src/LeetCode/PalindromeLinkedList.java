package LeetCode;
import Sort.ListNode;
// 1: Reverse the linked List and compare the list with original one and check both are same
// 2: Find the middle element of the linked List and reverse the list from second half and compare with 
//   first half , if both are same , Then return true;
public class PalindromeLinkedList {
    class ListNode {
    	int val;
    	ListNode next;
    	public ListNode(int data) {
    		this.val =data;
    	}
    }
    
public boolean isPalindrome(ListNode head){
	ListNode secondHead =  new ListNode(head.val);
	ListNode current = head;
	while(current.next !=null ){
		ListNode temp = new ListNode(current.next.val);
		temp.next = secondHead;
		secondHead  =temp;
		current = current.next;
	}
	ListNode l1 = head;
	ListNode l2 = secondHead;
	while(l1 != null){
		if(!(l1.val == l2.val)) return false;
	}
	return true;
}
public boolean isPalindromeSameList(ListNode head) {
	 
    if(head == null || head.next==null)
        return true;
 
    //find list center
    ListNode fast = head;
    ListNode slow = head;
 
    while(fast.next!=null && fast.next.next!=null){
        fast = fast.next.next;
        slow = slow.next;
    }
 
    ListNode secondHead = slow.next;
    slow.next = null;
 
    //reverse second part of the list
    ListNode p1 = secondHead;
    ListNode p2 = p1.next;
 
    while(p1!=null && p2!=null){
        ListNode temp = p2.next;
        p2.next = p1;
        p1 = p2;
        p2 = temp;
    }
 
    secondHead.next = null;
 
    //compare two sublists now
    ListNode p = (p2==null?p1:p2);
    ListNode q = head;
    while(p!=null){
        if(p.val != q.val)
            return false;
 
        p = p.next;
        q = q.next;
 
    }
 
    return true;
}
	
	
}
