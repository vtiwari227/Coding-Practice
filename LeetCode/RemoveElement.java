package LeetCode;
//Two pointer technique keep one pointer at zero ,use it to fill the elements while use another pointer to
// traversal the list
public class RemoveElement {
	public int removeElement(int[] A, int elem) {
		int j =0;
	for(int i =0; i< A.length;i++){
		if(!(A[i] == elem) ){
			A[j] = A[i];
			j++;
	}
		
	}
	return j;
	}
}
