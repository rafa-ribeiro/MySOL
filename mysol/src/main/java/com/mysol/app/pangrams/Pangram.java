package com.mysol.app.pangrams;

/**
 * Created by rafael on 06/06/16.
 */
public class Pangram {

    private static CharSequence[] alphabet = new CharSequence[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "w", "x", "y", "z" };

    public String isPangram(String input) {
        int[] freq = new int[alphabet.length];

        int sum = 0;
        for (int i = 0; i < alphabet.length; i++) {
            if (input.toLowerCase().contains(alphabet[i])) {
                if (freq[i] == 0) {
                    freq[i] = 1;
                    sum += 1;
                }


            }
        }
        return sum >= alphabet.length ? "pangram" : "not pangram";
    }
}
