package SetMismatch;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {2, 2};

        int[] tot = solution.findErrorNums(a);
        for (int i = 0; i < tot.length; i++) {
            System.out.println(tot[i]);
        }
    }

    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[nums[i] - 1]++;
        }
        int[] total = new int[2];

        for (int i = 0; i < n; i++) {
            if (arr[i] == 2) {
                total[0] = i + 1;

            }

            if (arr[i] == 0) {
                total[1] = i + 1;

            }
        }
        return total;

    }
}