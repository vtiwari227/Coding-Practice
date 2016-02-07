package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if(strs == null || strs.length == 0) return result;
        Arrays.sort(strs);
        Map<String, List<String>> map  = new HashMap<>();
        for(String s :strs){
        	char[] charArray = s.toCharArray();
        	Arrays.sort(charArray);
        	
        }
    }
}
