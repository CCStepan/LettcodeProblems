package MinimumAmountofTimetoCollectGarbage;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] garbage = {"MMM","PGM","GP"};
        int[] travel = {3,10};
        System.out.println(solution.garbageCollection(garbage, travel));
    }

    public int garbageCollection(String[] garbage, int[] travel) {
        int m = 0, p = 0, g = 0, ans = 0;

        for (int i = garbage.length - 1; i >= 0; i--) {
            ans += garbage[i].length();
            if (m == 0 && garbage[i].contains("M")) {
                m = i;
            }
            if (p == 0 && garbage[i].contains("P")) {
                p = i;
            }
            if (g == 0 && garbage[i].contains("G")) {
                g = i;
            }
        }
        //System.out.println(m + " " + p + " " + g);

        for (int i = 1; i < garbage.length; i++) {
            if (i <= p) {
                ans += travel[i - 1];
            }
            if (i <= m) {
                ans += travel[i - 1];
            }
            if (i <= g) {
                ans += travel[i - 1];
            }

        }
        return ans;
    }
}
