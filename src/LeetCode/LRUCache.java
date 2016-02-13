package LeetCode;

import java.util.HashMap;

// We will implement this through use of Hash Table and Doubly Linked List, Hash Table will make key access
// in O(1) time and Doubly Linked List will make node access in O(1) time
class Node {
	int key;
	int value;
	Node pre;
	Node next;
	public Node(int key, int  value) {
		this.key = key;
		this.value = value;
	}
}
public class LRUCache {
	HashMap<Integer,Node> map;
	int capacity ,count;
	Node head, tail;
	
	public LRUCache(int capacity){
		this.capacity = capacity;
		map = new HashMap<>();
		head = new Node(0,0);
		tail = new Node(0,0);
		head.next = tail;
		tail.pre = head;
		head.pre =null;
		tail.next = null;
		count =0;
		}
	
	
	public void deleteNode(Node node){
		node.pre.next = node.next;
		node.next.pre  = node.pre;
	}
	public void addToHead(Node node) {
		
		
	}
	
	
	
}