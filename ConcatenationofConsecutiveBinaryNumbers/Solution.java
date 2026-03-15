package ConcatenationofConsecutiveBinaryNumbers;

import java.math.BigInteger;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.concatenatedBinary(100000));


    }

    public int concatenatedBinary(int n) {
        long MOD = 1000_000_000 + 7;
        long total = 0;
        int shift = 0;
        for (int i = 0; i < n; i++) {
            if ((i+1 & i) == 0) shift++; // проверка на степень двойки

            total = ((total << shift) | (i + 1)) % MOD;


        }


        return (int) total;
    }
}