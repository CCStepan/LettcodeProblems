package PartitioningintoMinimumNumberOfDeciBinaryNumbers;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minPartitions("1"));
    }

    public int minPartitions(String n) {
        int total = 0;
        for (int i = 0; i < n.length(); i++) {
            total = Math.max(total, n.charAt(i) - '0');
        }
        return total;
    }
}