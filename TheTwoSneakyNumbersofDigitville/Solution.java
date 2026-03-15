package TheTwoSneakyNumbersofDigitville;

import java.util.HashMap;

public class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                hashMap.put(nums[i], 1);
            }

        }
        int[] total = new int[2];
        int x = 0;
        for (int key : hashMap.keySet()) {
            if (hashMap.get(key) == 2) {
                total[x] = key;
                x++;
            }
        }
        return total;
    }
}
