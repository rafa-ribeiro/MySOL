package com.mysol.app.palindrome;

public class PalindromeUtils {

    /**
     * Verifica se a palavra informada é um palíndromo ou quase. A palavra é "quase" um palíndromo se bastar
     * efetuar apenas a troca de um caractere para a palavra se tornar um.
     *
     * @param word Palavra a ser verificada
     * @return <code>true</code> em caso de palíndromo, senão <code>false</code>.
     */
    public boolean isAlmostPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;

        boolean hasOneDifference = false;

        for (int i = 0; i < word.length() / 2; i++) {
            Character chStart = word.charAt(start);
            Character chEnd = word.charAt(end);

            if (!chStart.equals(chEnd)) {
                if (hasOneDifference) {
                    return false;
                }
                hasOneDifference = true;
            }
            start++;
            end--;
        }

        return true;
    }

}
