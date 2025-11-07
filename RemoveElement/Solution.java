package RemoveElement;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {0,1,2,2,3,0,4,2};
        int v =2;
        System.out.println(solution.removeElement(a,v));
    }
    public int removeElement(int[] nums, int val) {
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
