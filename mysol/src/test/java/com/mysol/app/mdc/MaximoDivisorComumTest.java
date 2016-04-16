package com.mysol.app.mdc;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rafael on 15/04/16.
 */
public class MaximoDivisorComumTest {

    @Test
    public void testaMdc() {
        this.asserResult(new MaximoDivisorComum().mdc(10, 12), 2);
        this.asserResult(new MaximoDivisorComum().mdc(8, 4), 4);
        this.asserResult(new MaximoDivisorComum().mdc(28, 24), 4);
        this.asserResult(new MaximoDivisorComum().mdc(36, 24), 12);
        this.asserResult(new MaximoDivisorComum().mdc(15, 5), 5);
        this.asserResult(new MaximoDivisorComum().mdc(16, 5), 1);
        this.asserResult(new MaximoDivisorComum().mdc(110, 100), 10);
        this.asserResult(new MaximoDivisorComum().mdc(120, 100), 20);
    }

    private void asserResult(Integer result, Integer expected) {
        Assert.assertEquals("Validando MDC", expected, result);
    }

}
