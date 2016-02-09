package LeetCode;

import java.util.InputMismatchException;

public class ReverseInteger {
	public int reverse(int number){
		int result =0;
		boolean negativeFlag = false;
		if(number <0) {
			negativeFlag = true;
			number = - number;
		}
		int tempNumber =number;
		 while(tempNumber >0){
			 result = result*10 + tempNumber%10;
			 tempNumber = tempNumber/10;
		 }
		 if(negativeFlag){
			 result = 0-result;
		 }
		 
			 return result;
		 }
		 }
		 
		
	
//Another Method to reverse an integer and also factor in the overflow condition
/*int reverse(int x) {
    int sign = x < 0 ? -1 : 1;
    x = abs(x);
    int res = 0;
    while (x > 0) {
        if (INT_MAX / 10 < res || (INT_MAX - x % 10) < res * 10) {
            return 0;
        }
        res = res * 10 + x % 10;
        x /= 10;
    }*/

  
