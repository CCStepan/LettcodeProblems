package CountNumberofNiceSubarrays;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {2,2,2,1,2,2,1,2,2,2};
        System.out.println(solution.numberOfSubarrays(a, 2));
    }

    public int numberOfSubarrays(int[] nums, int k) {
        int[] prsum = new int[nums.length + 1];
        prsum[0] = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 != 0) {

                prsum[i + 1] = prsum[i] + 1;
            } else {
                prsum[i + 1] = prsum[i];
            }
        }
        int r = 1;
        int l = 0;
        int count = 0;
        while (r < prsum.length) {
            if (prsum[r] - prsum[l] == k) {
                int leftCount = 1;
                while (l + leftCount < r && prsum[l] == prsum[l + leftCount]) {
                    leftCount++;
                }

                int rightCount = 1;
                while (r + rightCount < prsum.length && prsum[r] == prsum[r + rightCount]) {
                    rightCount++;
                }

                count += leftCount * rightCount;
                l += leftCount;
                r += rightCount;
            } else if (prsum[r] - prsum[l] < k) {
                r++;
            } else if (prsum[r] - prsum[l] > k) {
                l++;
                if (l == r) {
                    r++;
                }
            }

        }

        return count;
    }
}