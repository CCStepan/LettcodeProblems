package FlippinganImage;

import javax.sound.sampled.SourceDataLine;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] a = {};
        int[][] res = solution.flipAndInvertImage(a);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (image[i][n - j-1] == 0 ){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = 0;
                }
            }
        }
        return arr;
    }
}