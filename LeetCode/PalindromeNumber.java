package LeetCode;

public class PalindromeNumber {
	public boolean isPalindrome(int x) {

	    if (x < 0) return false;

	    int p = x; 
	    int q = 0; 

	    while (p >0){
	        q *=10; 
	        q += p%10; 
	        p /=10; 
	    }

	    return q == x ;
	}
}
