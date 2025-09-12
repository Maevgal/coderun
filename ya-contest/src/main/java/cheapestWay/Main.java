package cheapestWay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] size = reader.readLine().split(" ");
        int n = Integer.parseInt(size[0]);
        int m = Integer.parseInt(size[1]);

        int[][] mas = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] rowValues = reader.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                mas[i][j] = Integer.parseInt(rowValues[j]);
            }
        }
        reader.close();

        int result = findShortScore(n, m, mas);

        writer.write(String.valueOf(result));
        writer.close();
    }

    public static int findShortScore(int n, int m, int[][] mas) {
        int[][] result = new int[n][m];
        result[0][0] = mas[0][0];

        for (int i = 1; i < m; i++) {
            result[0][i] = result[0][i - 1] + mas[0][i];
        }

        for (int i = 1; i < n; i++) {
            result[i][0] = result[i - 1][0] + mas[i][0];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                result[i][j] = Math.min(result[i - 1][j], result[i][j - 1]) + mas[i][j];
            }
        }
        return result[n - 1][m - 1];
    }
}
