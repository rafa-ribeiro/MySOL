package com.mysol.app.utils.impl;

import com.mysol.app.utils.api.Pair;

/**
 * Estrutura para armazenar um par de elementos do tipo Integer (A, B).
 *
 * @author rafael
 */
public class PairInteger implements Pair<Integer, Integer> {

    private final Integer a;

    private final Integer b;

    /**
     * Constructor.
     *
     * @param a Elemento A
     * @param b Elemento B
     */
    public PairInteger(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer getFirst() {
        return this.a;
    }

    @Override
    public Integer getSecond() {
        return this.b;
    }
}
