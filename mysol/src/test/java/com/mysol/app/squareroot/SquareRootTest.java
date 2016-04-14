package com.mysol.app.squareroot;

import org.junit.Assert;
import org.junit.Test;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;

/**
 * Teste do calculador de raiz quadrada.
 *
 * @author rafael
 */
public class SquareRootTest {

    @Test
    public void squareRootTest() {
        List<Integer> nums = Arrays.asList(9, 4, 16, 25, 10, 8, 100, 144, 13, 71, 2);
        nums.forEach(n -> this.assertRoot(n));
    }

    /**
     * @param num
     */
    private void assertRoot(int num) {
        double precision = 0.0001;
        SquareRoot squareRoot = new SquareRoot(precision);
        Assert.assertEquals("Validando raiz quadrada", Math.sqrt(num), squareRoot.sqrt(num), precision);

        NumberFormat formatter = new DecimalFormat("#0.0000");
        System.out.println("Raíz testada  "+ num + ": " + formatter.format(squareRoot.sqrt(num)));
    }

}
