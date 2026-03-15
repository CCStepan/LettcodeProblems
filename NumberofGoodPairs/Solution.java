package NumberofGoodPairs;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {1,2,3};
        System.out.println(solution.numIdenticalPairs(a));
    }

    public int numIdenticalPairs(int[] nums) {
        int n = nums.length, answer = 0;
        HashMap<Integer, Integer> set = new HashMap();
        for (int i = 0; i < n; i++) {
            if (!set.containsKey(nums[i])) {
                set.put(nums[i], 1);
            } else {
                set.put(nums[i], set.get(nums[i]) + 1);
            }
        }
        int t = 0;
        for (Integer key : set.keySet()) {

            t += (set.get(key)) * (set.get(key) - 1) / 2;
            //System.out.println("t= "+ t);
        }
        return t;


    }
}