package com.mysol.app.mdc;

/**
 * Created by rafael on 16/04/16.
 */
public class MaximoDivisorComum {

    public int mdc(int a, int b) {
        int min;
        int major;
        if (a < b) {
            min = a;
            major = b;
        } else {
            min = b;
            major = a;
        }

        if (min == 0) {
            return major;
        } else {
            return this.mdc(min, major % min);
        }

    }

}
