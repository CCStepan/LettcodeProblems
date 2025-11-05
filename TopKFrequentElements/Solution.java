package TopKFrequentElements;
//Approach 1: Heap

import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
                (x1, x2) -> (count.get(x1) - count.get(x2))
        );
        for (int i : count.keySet()) {
            heap.add(i);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        int[] total = new int[k];
        for (int i = k - 1; i >= 0; --i) {
            total[i] = heap.poll();
        }
        return total;


    }
}
