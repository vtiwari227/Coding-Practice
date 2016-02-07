package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static  int[] twoSum(int[] nums, int target){
     int[] result = {0,0};
    Map<Integer, Integer> map = new HashMap<>();
    
    for(int i=0; i<nums.length; i++){
        if(map.containsKey(target-nums[i])){
        	  map.put(nums[i], i+1);
            result[0] = map.get(target- nums[i]);
            result[1] = map.get(i);
            return result;
        }else{
            map.put(nums[i], i+1);
        }
    }
        return result;
}
    public static void main(String[] args) {
    	int[] input = {3,2,4};
    	int[] output =twoSum(input,6);
    	System.out.println(output[0]+" "+ output[1]);
    }
}