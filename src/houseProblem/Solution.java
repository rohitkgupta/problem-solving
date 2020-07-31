package houseProblem;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

    }

    public List<Integer> cellCompete(int[] states, int days) {
        int n = states.length;
        int[] output = new int[n];
        while (days > 0) {
            for (int i = 0; i < n; i++) {
                int left = i == 0 ? 0 : states[i - 1];
                int right = i == n - 1 ? 0 : states[i + 1];
                output[i] = getState(states[i], left, right);
            }
            states = Arrays.copyOf(output, output.length);
            days--;
        }

        List<Integer> result = new LinkedList<>();
        for (int out :
                output) {
            result.add(out);
        }

        return result;
    }

    private int getState(int current, int left, int right) {
        if (left == right) {
            return 0;
        }
        return 1;
    }
}
