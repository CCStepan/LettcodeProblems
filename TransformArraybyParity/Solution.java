package TransformArraybyParity;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a[] = {1,5,1,4,2};
        for (int x : solution.transformArray(a)) {
            System.out.print(x + " ");
        }
    }

    public int[] transformArray(int[] nums) {
        int odd = 0;
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 != 0) {
                odd++;
            }
        }
        for (int i = n - odd; i < n; i++) {
            arr[i] = 1;
        }
        return arr;
    }
}
