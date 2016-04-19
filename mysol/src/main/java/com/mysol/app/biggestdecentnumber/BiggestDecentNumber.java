package com.mysol.app.biggestdecentnumber;

/**
 * A Decent Number has the following properties:
 * <p>
 * Its digits can only be 3's and/or 5's.
 * The number of 3's it contains is divisible by 5.
 * The number of 5's it contains is divisible by 3.
 * If there are more than one such number, we pick the largest one.
 *
 * @author rafael
 */
public class BiggestDecentNumber {


    public BiggestDecentNumber() {

    }

    public String calc(int n) {
        int q = n;
        while (q % 3 != 0) {
            q -= 5;
        }
        if (q < 0) {
            return "-1";
        }
        return repeat("5", q).concat(repeat("3", n - q));
    }

    private static String repeat(String repeater, int times) {
        return new String(new char[times]).replace("\0", repeater);
    }

    private static void print(String str) {
        System.out.println(str);
    }

}
