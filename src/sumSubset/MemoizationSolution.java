package sumSubset;

import utils.PrintUtils;

public class MemoizationSolution {
/*
Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
Output: True
There is a subset (4, 5) with sum 9.

Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 30
Output: False
There is no subset that add up to 30.
    * */
    private static int[][] table= null;

    public static void main(String[] args) {
        int[] set = new int[]{3, 34, 4, 12, 5, 2};
        int sum = 9;
        table = new int[set.length+1][sum+1];
        for (int i=0; i<set.length+1; i++){
            for (int j=0; j <sum+1; j++){
                table[i][j] = -1;
            }
        }

        PrintUtils.printArray(table);
        System.out.println(sumSubsetExist(set, set.length, sum));
        PrintUtils.printArray(table);
    }


    private static int sumSubsetExist(int[] set, int n, int capacity){
        if (table[n][capacity] != -1) {
            System.out.println("Calculation saved");
            return table[n][capacity];
        }
        if(capacity == 0){
            return 1;
        }
        if(n == 0){
            return 0;
        }
        if (set[n-1] <= capacity) {
            table[n][capacity] = (sumSubsetExist(set, n - 1, capacity - set[n - 1]) + sumSubsetExist(set, n - 1, capacity));
            return table[n][capacity];
        } else {
            table[n][capacity] = sumSubsetExist(set, n - 1, capacity);
            return table[n][capacity];
        }
    }
}
