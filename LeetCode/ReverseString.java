package LeetCode;

public class ReverseString {
	public String reverseWords(String s) {
      if(s == null || s.length() == 0) return "";
       String[] arr = s.split(" ");
       StringBuilder sb = new StringBuilder();
       for(int j = arr.length-1; j>=0 ;j--) {
    	   sb.append(arr[j]).append(" ");
       }
       return sb.toString();
	}
	//Another method to remove the white spaces and trim to get the exact length and then build from string
	
	/*String[] parts = s.trim().split("\\s+");
	String out = "";
	if (parts.length > 0) {
	    for (int i = parts.length - 1; i > 0; i--) {
	        out += parts[i] + " ";
	    }
	    out += parts[0];
	}
	return out;*/
	
	public void reverseWords(char[] s) {
	    // Three step to reverse
	    // 1, reverse the whole sentence
	    reverse(s, 0, s.length - 1);
	    // 2, reverse each word
	    int start = 0;
	    int end = -1;
	    for (int i = 0; i < s.length; i++) {
	        if (s[i] == ' ') {
	            reverse(s, start, i - 1);
	            start = i + 1;
	        }
	    }
	    // 3, reverse the last word, if there is only one word this will solve the corner case
	    reverse(s, start, s.length - 1);
	}

	public void reverse(char[] s, int start, int end) {
	    while (start < end) {
	        char temp = s[start];
	        s[start] = s[end];
	        s[end] = temp;
	        start++;
	        end--;
	    }
	}
	}

