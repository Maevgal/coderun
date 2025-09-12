package cheapestWay;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static cheapestWay.Main.findShortScore;

class MainTest {
    @Test
    void example() {
        int n = 5;
        int m = 5;
        int[][] mas = {
                {1, 1, 1, 1, 1},
                {3, 100, 100, 100, 100},
                {1, 1, 1, 1, 1},
                {2, 2, 2, 2, 1},
                {1, 1, 1, 1, 1}
        };
        Assertions.assertEquals(11, findShortScore(n, m, mas));

    }
}