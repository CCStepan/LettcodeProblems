package LeftandRightSumDifferences;


public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1,7};
        for (int x : solution.leftRightDifference(a)) {
            System.out.print(x + " ");
        }
    }

    public int[] leftRightDifference(int[] nums) {
        int[] lsum = new int[nums.length];
        int[] rsum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {


            if (i == 0) {
                lsum[i] = 0;
                rsum[nums.length - 1] = 0;
            } else {
                lsum[i] = lsum[i - 1] + nums[i - 1];
                rsum[nums.length - 1 - i] = nums[nums.length - i] + rsum[nums.length - i];
            }
        }
        int ans[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = Math.abs(lsum[i] - rsum[i]);
        }


        return ans;
    }
}