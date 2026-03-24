package SumofVariableLengthSubarrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {2,2,2,2,2};
        System.out.println(solution.subarraySum(a));
    }

    public int subarraySum(int[] nums) {
        int[] prs = new int[nums.length + 1];
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            prs[i + 1] = prs[i] + nums[i];
        }
//        for (int i = 0; i < prs.length; i++) {
//            System.out.print(prs[i] + " ");
//        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                ans += prs[1];
            } else {
                ans += prs[i + 1] - prs[Math.max(0, i - nums[i])];
            }
        }
        return ans;
    }
}
