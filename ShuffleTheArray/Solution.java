package ShuffleTheArray;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] a ={1,1,2,2};
        int n=2;
        int[] tot =solution.shuffle(a, n);
        for (int i = 0; i < 2*n; i++) {
            System.out.print(tot[i]+ " ");
        }
    }
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[2 * n];
        int k=0, t=0;
        for (int i = 0; i < 2*n;i++ ) {
            if(i%2==0) {
                arr[i] = nums[k];
                k++;
            }else{
                arr[i] = nums[t+n];
                t++;
            }

        }

        return arr;
    }
}