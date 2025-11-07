package SearchInsertPosition;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1,2,4,6,7};
        int t = 3;
        System.out.println(solution.searchInsert(a, t));
    }

    public int searchInsert(int[] nums, int target) {

        if (nums.length == 1) {
            if (target > nums[0]) {
                return 1;
            }
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        if (target < nums[0]) {
            return 0;
        }
        int lo = 0;
        int hi = nums.length - 1;
        int mi = lo + (hi - lo) / 2;
        while (lo <= hi) {
            //System.out.println(lo+" "+mi+" "+hi);
            if (lo + 1 == mi && target > nums[lo] && target < nums[mi]) {
                return lo + 1;
            }
            if (mi + 1 == hi && target > nums[mi] && target < nums[hi]) {
                return mi + 1;
            }
            if (lo + 1 == hi && target > nums[lo] && target < nums[hi]) {
                return lo + 1;
            }
            if (target < nums[mi]) {
                hi = mi - 1;
                mi = lo + (hi - lo) / 2;
            }
            if (target > nums[mi]) {
                lo = mi + 1;
                mi = lo + (hi - lo) / 2;
            }
            if (target == nums[mi]) {
                return mi;
            }

        }

        return lo;
    }
}