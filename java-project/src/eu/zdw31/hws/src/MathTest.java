package eu.zdw31.hws.src;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MathTest {
    Math m = new Math();

    @Test
    void testSubstract() {
        int result = m.substract(10, 1);
        Assert.assertEquals(result, 9);
    }

    @Test
    void TestAdd() {
        int result = m.add(10, 1);
        Assert.assertEquals(result, 11);
    }

    @Test
    void testContainsDuplicateSuccess() {
        /* todo */
    }

    @Test
    void testContainsDuplicateFail() {
        /* todo */
    }

    @Test
    void testTwoSum() {
        /* todo */
    }

}
