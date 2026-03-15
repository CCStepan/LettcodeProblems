package PartitionArrayAccordingtoGivenPivot;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a = {10,6,3,9};
        for (int x : solution.pivotArray(a, 10)) {
            System.out.print(x + " ");
        }
    }

    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> l = new ArrayList<Integer>();
        List<Integer> p = new ArrayList<Integer>();
        List<Integer> r = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                l.add(nums[i]);
            } else if (nums[i] == pivot) {
                p.add(nums[i]);
            } else {
                r.add(nums[i]);
            }
        }
        int total[] = new int[nums.length];
        int i = 0, j = 0, k = 0;
        //System.out.println(l.size() + " " + p.size() + " " + r.size());
        while (i < l.size() || j < p.size() || k < r.size()) {
//            System.out.println(i + " " + j + " " + k);
//            System.out.println();
//            for (int x : total) {
//                System.out.print(x + " ");
//            }
//            System.out.println();
            if (i < l.size()) {
                total[i + j + k] = l.get(i);
                i++;

            }
            else if (j < p.size()) {
                total[i + j + k] = p.get(j);
                j++;
            }
            else if (k < r.size())  {
                total[i + j + k] = r.get(k);
                k++;
            }


        }
        return total;
    }
}
