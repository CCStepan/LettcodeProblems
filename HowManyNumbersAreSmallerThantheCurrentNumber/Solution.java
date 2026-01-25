package HowManyNumbersAreSmallerThantheCurrentNumber;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a1 = {8, 1, 2, 2, 3};
        int[] t1 = solution.smallerNumbersThanCurrent(a1);
        for (int i = 0; i < t1.length; i++) {
            System.out.print(t1[i] + " ");
        }
//        System.out.println();
//        int[] a2 = {6, 5, 4, 8};
//        int[] t2 = solution.smallerNumbersThanCurrent(a2);
//        for (int i = 0; i < t2.length; i++) {
//            System.out.print(t2[i] + " ");
//        }

//        System.out.println();
//        int[] a3 = {7, 7, 7, 7};
//        int[] t3 = solution.smallerNumbersThanCurrent(a3);
//        for (int i = 0; i < t3.length; i++) {
//            System.out.print(t3[i] + " ");
//        }
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;

        int[] freq = new int[101];
        int[] total = new int[n];
        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            System.out.print(freq[i]+" ");
        }
        System.out.println();


        for (int i = 1; i < 101; i++) {
            freq[i] += freq[i - 1];
        }
        for (int i = 0; i < freq.length; i++) {
            System.out.print(freq[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                total[i] = 0;
            } else {
                total[i] = freq[nums[i]-1];
            }
        }
        return total;
    }
}