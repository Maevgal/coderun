package knightMove;

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

        long result = countOfWay(n, m);

        writer.write(String.valueOf(result));

        reader.close();
        writer.close();
    }

    static long countOfWay(int n, int m) {

        long[][] resultMas = new long[n][m];
        resultMas[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i >= 2 && j >= 1) {
                    resultMas[i][j] += resultMas[i - 2][j - 1];
                }
                if (i >= 1 && j >= 2) {
                    resultMas[i][j] += resultMas[i - 1][j - 2];
                }
            }
        }
        return resultMas[n - 1][m - 1];

    }
}
