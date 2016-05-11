package LeetCode;
// The idea for this problem is to traverse from end and check which one is greater and start the problem 
// with rest 

public class MergeSortedArray {
public void merge(int A[] ,int m, int B[] , int n){
	int k = m+n-1;
	int i = m-1;
	int j = n-1;
	while(j >-1  && i > -1) A[k--] =(A[i] >B[j]) ? A[i--] :B[j--];
	while(j> -1) A[k--] = B[j--];
}
}
