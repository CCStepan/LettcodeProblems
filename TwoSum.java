public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        Solution solution= new Solution();
        for (int el:solution.twoSum(arr, target)){
            System.out.print(el+" ");
        }
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i!=j && nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;

                    return arr;
                }
            }
        }
        return arr;
    }
}