package FindMinimumOperationstoMakeAllElementsDivisiblebyThree;

public class Solution {
    public int minimumOperations(int[] nums) {
        int tot = 0;
        for (int i = 0; i < nums.length; i++) {
            int tmp = nums[i] % 3;

            switch (nums[i] % 3) {
                case 0:
                    break;
                case 1:
                    tot += 1;
                    break;
                case 2:
                    tot += 1;
                    break;

            }

        }
        return tot;
    }
}