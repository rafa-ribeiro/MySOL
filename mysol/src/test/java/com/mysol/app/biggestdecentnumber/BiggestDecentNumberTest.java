package com.mysol.app.biggestdecentnumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by rafael on 18/04/16.
 */
public class BiggestDecentNumberTest {

    /**
     * Test BiggestDecentNumber.
     */
    @Test
    public void testBiggestDecentNumber() {
        BiggestDecentNumber bdn = new BiggestDecentNumber();

        assertEquals("-1", bdn.calc(2));
        assertEquals("555", bdn.calc(3));
        assertEquals("33333", bdn.calc(5));
        assertEquals("55555533333", bdn.calc(11));
        assertEquals("555555555555555555", bdn.calc(18));
        assertEquals("55555555555555533333", bdn.calc(20));
    }

}
