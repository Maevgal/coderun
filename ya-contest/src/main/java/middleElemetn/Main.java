package middleElemetn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        reader.close();

        int median = findMedian(input);
        System.out.println(median);
    }

    public static int findMedian(String input) {
        String[] mas = input.split(" ");

        int[] numbers = new int[mas.length];
        for (int i = 0; i < mas.length; i++) {
            numbers[i] = Integer.parseInt(mas[i]);
        }

        Arrays.sort(numbers);
        return numbers[1];
    }
}
