package middleElemetn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static middleElemetn.Main.findMedian;

class MainTest {
    @Test
    void example() {
        Assertions.assertEquals(2,findMedian("1 2 3"));
        Assertions.assertEquals(0,findMedian("1000 -1000 0"));
        Assertions.assertEquals(3,findMedian("3 1 3"));
    }
}