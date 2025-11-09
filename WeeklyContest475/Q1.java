package WeeklyContest475;

import java.util.HashMap;

public class Q1 {
    public static void main(String[] args) {
        Q1 solution = new Q1();
        int[] a = {1, 1, 2};
        System.out.println(solution.minimumDistance(a));
    }

    public int minimumDistance(int[] nums) {
        if (nums.length == 0 || nums.length == 1 || nums.length == 2) {
            return -1;
        }
        HashMap<Integer, Integer[]> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hashMap.containsKey(nums[i])) {
                Integer[] a = {i};
                hashMap.put(nums[i], a);
            } else {
                Integer[] a = hashMap.get(nums[i]);

                Integer[] arr = new Integer[a.length + 1];
                for (int j = 0; j < a.length; j++) {
                    arr[j] = a[j];
                }
                arr[arr.length - 1] = i;
                hashMap.put(nums[i], arr);
            }


        }
        int min = Integer.MAX_VALUE;
        boolean f = false;
        for (Integer key : hashMap.keySet()) {

            if (hashMap.get(key).length >= 3) {
                f = true;
                for (int i = 0; i < hashMap.get(key).length; i++) {
                    for (int j = 0; j < hashMap.get(key).length; j++) {
                        for (int k = 0; k < hashMap.get(key).length; k++) {
                            if (i != j && i != k && j != k) {
//                                System.out.println(key + " " + hashMap.get(key)[i] + " " + hashMap.get(key)[j] + " " + hashMap.get(key)[k] + "__" + (Math.abs(i - j) + Math.abs(j - k) + Math.abs(k - i)));
                                Integer a = hashMap.get(key)[i];
                                Integer b = hashMap.get(key)[j];
                                Integer c = hashMap.get(key)[k];
                                if (Math.abs(a - b) + Math.abs(b - c) + Math.abs(c - a) < min) {
                                    min = Math.abs(a - b) + Math.abs(b - c) + Math.abs(c - a);
                                }
                            }
                        }
                    }
                }
            }
//            System.out.println();
//            System.out.println();
//            for (int j = 0; j < hashMap.get(key).length; j++) {
//                System.out.print(key + "__" + hashMap.get(key)[j] + " ");
//            }
//            System.out.println();
        }
        if (!f) {
            return -1;
        }
        return min;
    }
}
