package PlusOne;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[ ] a = {9};
        System.out.println(Arrays.toString(solution.plusOne(a)));
    }
    public int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        int i = digits.length - 1;

        while (digits[i] > 9) {

            if (i - 1 >= 0) {

                digits[i] = digits[i] % 10;
                digits[i - 1]++;
            } else {
                digits[0] = (digits[0]) % 10;
                int[] newArr = new int[digits.length + 1];
                newArr[0] = 1;
                for (int j = 1; j < digits.length + 1; j++) {
                    newArr[j] = digits[j - 1];
                }
                return newArr;
            }
            i--;
        }
        return digits;
    }
}
