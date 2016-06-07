package com.mysol.app.pangrams;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rafael on 06/06/16.
 */
public class PangramTest {

    @Test
    public void testPangram() {
        String input = "We promptly judged antique ivory buckles for the next prize";

        Pangram p =new Pangram();
        String output = p.isPangram(input);
        Assert.assertEquals("pangram", output);
    }

    @Test
    public void testNotPangram() {
        String input = "We promptly judged antique ivory buckles for the prize";

        Pangram p =new Pangram();
        String output = p.isPangram(input);
        Assert.assertEquals("not pangram", output);
    }

}
