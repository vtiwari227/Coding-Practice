package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	 public static List<List<String>> groupAnagrams(String[] strs) {
	        if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
	        Map<String, List<String>> map = new HashMap<String, List<String>>();
	        Arrays.sort(strs);
	        for (String s : strs) {
	            char[] ca = s.toCharArray();
	            Arrays.sort(ca);
	            String keyStr = String.valueOf(ca);
	            if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<String>());
	            map.get(keyStr).add(s);
	        }
	        return new ArrayList<List<String>>(map.values());
	    }
	 
	 
	 public static void main(String[] args){
		 String[] array = 	{"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> result =  groupAnagrams(array);
		//erator it =  result.iterator();
		  for(List<String> list :result){
			  System.out.println(list);
		  }
	 }
}
