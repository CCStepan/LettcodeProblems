import java.util.HashMap;

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
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int elem = target-nums[i];
            if(hashMap.containsKey(elem)){
                return new int[] { hashMap.get(elem), i};
            }
            hashMap.put(nums[i], i);
        }
        return new int[] {};
    }
}