package LeetCode;

public class EditDistance {
	 public int minDistance(String word1, String word2) {
		 int length1 = word1.length();
		 int length2 = word2.length();
		 int[][] resultArray = new int[length1+1][length2+1];
		 for(int i =0;i< length1;i++ ){
			 resultArray[i][0] =i;
		 }
		 for(int j =0;j< length2;j++ ){
			 resultArray[0][j] =j;
		 }
		 for(int i =0;i< length1;i++ ){
			 for(int j =0;j< length2;j++ ){
				 if(length1 == length2) {
					 resultArray[i][j] = resultArray[i-1][j-1];
				 }
				 else {
					 resultArray[i][j] = Math.min(resultArray[i-1][j-1],Math.min(resultArray[i-1][j],resultArray[i][j-1]) )+1;
				 }
			 }
		 }
		 
	   return resultArray[length1][length2];
	 }
	 }

