package MaxConsecutiveOnes;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int m = -1, curr = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                curr++;
            } else {
                if (curr > m) {
                    m = curr;

                }
                curr = 0;
            }
        }
        if (curr > m) {
            m = curr;
        }
        return m;
    }
}