package sumSubset;

public class RecursiveSolution {
/*
Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 9
Output: True
There is a subset (4, 5) with sum 9.

Input: set[] = {3, 34, 4, 12, 5, 2}, sum = 30
Output: False
There is no subset that add up to 30.
    * */

    public static void main(String[] args) {
        int[] set = new int[]{3, 34, 4, 12, 5, 2};
        int sum = 30;
        System.out.println(sumSubsetExist(set, set.length, sum));

    }

    private static boolean sumSubsetExist(int[] set, int n, int capacity){
        if(capacity == 0){
            return true;
        }
        if(n == 0){
            return false;
        }
        if (set[n-1] <= capacity) {
            return (sumSubsetExist(set, n-1, capacity-set[n-1]) || sumSubsetExist(set, n-1, capacity));
        } else {
            return sumSubsetExist(set, n-1, capacity);
        }
    }
}
