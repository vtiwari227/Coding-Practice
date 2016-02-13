package LeetCode;

import java.util.ArrayList;
import java.util.List;

//The logic for this question involves that if element and element +1 difference is 1 and the currnt Index 
//is still below array.length-1 and after this iteration set if earlier element is not same as new one the
// report that range
public class SummaryRanges {
	public List<String> summaryRanges(int[] nums) {
		List<String> list = new ArrayList();
		if(nums.length ==1){
			list.add(nums[0]+"");
			return list;
		}
		for(int i =0; i< nums.length;i++){
			int a = nums[i];
			while(i+1 <nums.length && nums[i+1]-nums[i] ==1){
				i++;
			}
			if(a != nums[i]){
				list.add(a+"->"+nums[i]);
			} else {
			   list.add(a+"");	
			}
		}
		return list;
	}
}
