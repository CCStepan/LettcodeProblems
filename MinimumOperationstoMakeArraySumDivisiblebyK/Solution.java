package MinimumOperationstoMakeArraySumDivisiblebyK;

public class Solution {
    public int minOperations(int[] nums, int k) {
        int s = 0;
        for (int e : nums) {
            s += e;
        }
        return s % k;
    }
}