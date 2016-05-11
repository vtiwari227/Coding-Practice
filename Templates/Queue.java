package Templates;
import Sort.ListNode;
class Queue{
	ListNode first, last;
 
	public void enqueue(ListNode n){
		if(first == null){
			first = n;
			last = first;
		}else{
			last.next = n;
			last = n;
		}
	}
 
	public ListNode dequeue(){
		if(first == null){
			return null;
		}else{
			ListNode temp = new ListNode(first.val);
			first = first.next;
			return temp;
		}	
	}
}