package LeetCode;

import java.util.ArrayList;
import java.util.List;


public class MinStack {
 private List<Integer> stack;
 private List<Integer> minStack;
 
 public MinStack() {
	 minStack = new ArrayList<Integer>();
	 stack   = new ArrayList<Integer>();
 }
 public void push(int x) {
	 stack.add(x);
	 if(minStack.isEmpty()){
		 minStack.add(x);
	 }
	 else {
		 if(minStack.get((minStack.size()-1)) > x ){
			 minStack.add(x);
		 }
	 }
 }
 public void pop(){
	 if(top() == minStack.get((minStack.size()-1))) {
		 minStack.remove(minStack.size()-1);
	 }
 }
 public int top(){
	 return stack.get(stack.size()-1);
 }
 public int getMin() {
	 return minStack.get(minStack.size()-1);
 }
}
