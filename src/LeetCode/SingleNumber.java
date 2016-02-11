package LeetCode;

import java.util.HashSet;
import java.util.Iterator;

// One solution using Bit Manupliation, A^A  will lead 0 and only leave one element 
public class SingleNumber {
public int singleNumberusingBit(int[] array){
	int tempNumber =0;
    for(int num : array){
    	tempNumber = tempNumber^num;
    }
    return tempNumber;
}
public int singleNumber(int[] array){
	HashSet<Integer> objSet = new HashSet<Integer>();
	for(int num: array) {
		if(objSet.contains(num)){
			objSet.remove(num);
		}
	}
	Iterator<Integer> it = objSet.iterator();
	return it.hasNext();
}
}
