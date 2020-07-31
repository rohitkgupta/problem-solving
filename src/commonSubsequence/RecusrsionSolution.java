package commonSubsequence;

public class RecusrsionSolution {

    public static void main(String[] args) {
        String s1 = "abadc";
        String s2 = "dabc";
        System.out.println(commonSubsequenceLenght(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length()));
    }

    private static int commonSubsequenceLenght(char[] arr1, char[] arr2, int n, int m) {
        if (n == 0 || m == 0)
            return 0;

        if (arr1[n - 1] == arr2[m - 1])
            return 1 + commonSubsequenceLenght(arr1, arr2, n - 1, m - 1);
        else
            return 0;
            //return Math.max(commonSubsequenceLenght(arr1, arr2, n, m - 1), commonSubsequenceLenght(arr1, arr2, n - 1, m));
    }

}
