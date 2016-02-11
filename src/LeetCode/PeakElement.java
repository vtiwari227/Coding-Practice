package LeetCode;
//1. Loop through the whole array and treat last two cases separately and see if current element is greater
// than the next and previous and return the index of highest peak
public class PeakElement {
public int findPeakElement(int[] num){

	        int max = num[0];
	        int index = 0;
	        for(int i=1; i<=num.length-2; i++){
	            int prev = num[i-1];
	            int curr = num[i];
	            int next = num[i+1];
	 
	            if(curr > prev && curr > next && curr > max){
	                index = i;
	                max = curr;
	            }
	        }
	 
	        if(num[num.length-1] > max){
	            return num.length-1;
	        }
	 
	        return index;
	    }
	}

