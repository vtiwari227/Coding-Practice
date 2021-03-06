package LeetCode;
//1. Loop through the whole array and treat last two cases separately and see if current element is greater
// than the next and previous and return the index of highest peak

// Use Binary Search with the property 
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
// Binary search with logic that if mid+1 is greater than mid in that case any local peak will be in second 
// half beacuse if elements are increasing surely  and if it's decreasing then that the maximum 
    int findPeakElement1(int[] num) 
    {
        int low = 0;
        int high = num.length-1;

        while(low < high)
        {
            int mid1 = (low+high)/2;
            int mid2 = mid1+1;
            if(num[mid1] < num[mid2])
                low = mid2;
            else
                high = mid1;
        }
        return low;
    }
};
