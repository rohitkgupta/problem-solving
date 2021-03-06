package targetSubsetSum;

import utils.PrintUtils;

public class TopToDownSolution {
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
        int[] set = new int[]{3, 4, 5, 2};
        int sum = 1;
        table = new int[set.length+1][sum+1];
        for (int i=0; i<set.length+1; i++){
            for (int j=0; j <sum+1; j++){
                if (j==0){
                    table[i][j] = 1;
                } else if (i==0){
                    table[i][j] = 0;
                } else
                    table[i][j] = -1;
            }
        }
        //PrintUtils.printArray(table);

        System.out.println(sumSubsetExist(set, set.length, sum));

        //System.out.println(table[set.length][sum]);
        PrintUtils.printArray(table);
    }

    private static int sumSubsetExist(int[] set, int n, int capacity){
        for (int i=1; i<n+1; i++){
            for (int j = 1; j < capacity + 1; j++){
                if (set[i-1] <= j) {
                    table[i][j] = table[i-1][j - set[i-1]] + table[i-1][j];
                } else {
                    table[i][j] = table[i-1][j];
                }
            }
        }
        return table[n][capacity];
    }
}
