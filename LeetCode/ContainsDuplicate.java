package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static boolean containsDuplicate(int[] array){
		if(array == null || array.length == 0) return false;
		Set<Integer> objSet = new HashSet<Integer>();
		for(int i =0; i< array.length -1; i++){
			if(objSet.contains(array[i])) return true;
			  objSet.add(array[i]);
		}
		return false;
	}
	public static void main(String[] args){
		int[] array = {2,6,3,4,5,6,7};
		System.out.println(containsDuplicate(array));
	}
}
