package MaximumNumberofWordsFoundinSentences;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] arr = {""};
        System.out.println(solution.mostWordsFound(arr));
    }

    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            int k = 0;
            if (sentences[i].length() > 0) {
                for (int j = 0; j < sentences[i].length(); j++) {
                    if (sentences[i].charAt(j) == ' ') {
                        k++;
                    }
                }
                if (k + 1 > max) {
                    max = k + 1;
                }
            }
        }
        return max;
    }
}