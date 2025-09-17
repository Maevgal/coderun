package knightMove;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static knightMove.Main.countOfWay;

class MainTest {
    @Test
    void oneWayNM() {
        int n = 3;
        int m = 2;
        Assertions.assertEquals(1, countOfWay(n, m));
    }

    @Test
    void oneWayMN() {
        int n = 2;
        int m = 3;
        Assertions.assertEquals(1, countOfWay(n, m));
    }

    @Test
    void moreWay() {
        int n = 31;
        int m = 34;
        Assertions.assertEquals(293930, countOfWay(n, m));
    }
}