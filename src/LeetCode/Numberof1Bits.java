package LeetCode;

public class Numberof1Bits {
 int counter =0;
 public int oneBitCounter(int number){
	 for(int i=1;i<33;i++){
		 if((number&(1<<i)) == 1) counter++;
	 }
	 return counter;
 }
}
