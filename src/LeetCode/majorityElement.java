package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class majorityElement {
	   public int findmajorityElement(int[] num) {
	        if(num.length==1){
	            return num[0];
	        }
	 
	        Arrays.sort(num);
	 
	        int prev=num[0];
	        int count=1;
	        for(int i=1; i<num.length; i++){
	            if(num[i] == prev){
	                count++;
	                if(count > num.length/2) return num[i];
	            }else{
	                count=1;
	                prev = num[i];
	            }
	        }
	 
	        return 0;
	    }

//Since majority element will always take half of the element .we can see that majority element will alway
//take middle position

public int majorityElementMedian(int[] num) {
	if (num.length == 1) {
		return num[0];
	}
 
	Arrays.sort(num);
	return num[num.length / 2];
}


//You can further implement the same solution using HashMap to make it genralize over n/3 and other
// Excellent example of looping over entry interface.
public List<Integer> findmajorityElementMap(int[] nums) {
	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
for(int i: nums){
    if(map.containsKey(i)){	
        map.put(i, map.get(i)+1);
    }else{
        map.put(i, 1);
    }
}

List<Integer> result = new ArrayList<Integer>();
for(Map.Entry<Integer, Integer> entry : map.entrySet()){
	if(entry.getValue() > nums.length/3){
		result.add(entry.getKey());
	}
}
 return result;
}
}