package LeetCode;

import java.util.List;
// Method of checking prime by running sqrt(n) for all n elements
// it will return O(n^2)
//Will solve through sieve of Eratosthenes
public class CountPrimes {
	public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }

        return count;
    }
}
