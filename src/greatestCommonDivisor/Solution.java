package greatestCommonDivisor;

public class Solution {
    public int generalizedGCD(int num, int[] arr) {
        if (num ==0){
            return 0;
        }
        int maxGcd = 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (arr[j] % arr[i] != 0) {
                    break;
                }
                if (j == num - 1 && arr[i] > maxGcd) {
                    maxGcd = arr[i];
                }
            }
        }
        return maxGcd;
    }

    public static void main(String[] args) {
        int[] input = new int[]{};
        Solution s = new Solution();
        System.out.println(s.generalizedGCD(input.length, input));
    }
}
