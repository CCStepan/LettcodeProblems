package RestoreFinishingOrder;

import java.util.HashMap;


public class Solution {

    public int[] recoverOrder(int[] order, int[] friends) {
        HashMap<Integer, Integer> hashSet = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            hashSet.put(friends[i], i);
        }
        int[] tot = new int[friends.length];
        int j = 0;

        for (int i = 0; i < order.length; i++) {
            if (hashSet.containsKey(order[i])) {
                tot[j] = order[i];
                j++;
            }
        }

        return tot;
    }
}