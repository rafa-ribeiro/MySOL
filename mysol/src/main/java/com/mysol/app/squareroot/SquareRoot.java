package com.mysol.app.squareroot;

/**
 * Calcula a raiz quadrada de um número, sem utilizar de funções existentes.
 * <p>
 * <p>
 * Estratégia:
 * <p>
 * 1. Se quer calcular a raiz quadrada de X.
 * 2. Dado X, é criado um intervalo [I, S] em que, SQRT(X) pertence ao intervalo [I, S]
 * 3. Deve ser definido um valor de precisão. Quanto menor o valor, maior exatidão no cálculo da raiz.
 * 4. Enquanto o tamanho do intervalo (limite superior - limite inferior) for maior que a precisão, deve-se:
 * <t></t>4.1 Calcula o valor médio do intervalo, M
 * <t></t>4.2 Se M * M é maior que X
 * <t></t>4.3 Então Muda o limite superior do intervalo, ou seja, troca S por M.
 * <t></t>4.4 Senão Muda o limite inferior do intervalo, ou seja, troca I por M.
 * 5. O resultado final em M, é o resultado da raíz quadrada.
 * <p>
 *
 * @author rafael
 */
public class SquareRoot {

    private double precision;

    public SquareRoot() {
        this.precision = 0.01;
    }

    public SquareRoot(double precision) {
        this.precision = precision;
    }

    /**
     * Calcula a raíz quadra do número informado.
     *
     * @param num Número inteiro positivo.
     * @return Valor da raíz quadra
     */
    public double sqrt(int num) {
        double leftLim = 1;
        double rightLim = num / 2 + 1;

        double length;
        double middle;

        do {
            length = rightLim - leftLim;
            middle = (rightLim + leftLim) / 2;
            if (middle * middle > num) {
                rightLim = middle;
            } else {
                leftLim = middle;
            }
        } while (length > this.precision);

        return middle;
    }

}
