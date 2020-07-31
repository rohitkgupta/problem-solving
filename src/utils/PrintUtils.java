package utils;

public class PrintUtils {
    public static void printArray(int[][] table) {
        System.out.println("________________________");
        for (int i = 0; i < table.length; i++) {
            System.out.println("");
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + ",");
            }
        }
        System.out.println("\n________________________");
    }
}
