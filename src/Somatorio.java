/**
 * Classe utilitária que disponibiliza operações genéricas de somatório.
 * <p>
 * Esta classe faz parte do framework e permite calcular o somatório de
 * qualquer função definida sobre números inteiros, para um intervalo
 * especificado.
 * </p>
 *
 * <p>
 * A função a aplicar é fornecida pelo cliente através da interface
 * {@link ISomatorio}, promovendo reutilização e baixo acoplamento.
 * </p>
 */
public final class Somatorio {

    /**
     * Construtor privado para impedir a instanciação da classe.
     */
    private Somatorio() {
        // Evita instanciação
    }

    /**
     * Calcula o somatório de uma função {@code f(i)} para todos os valores
     * inteiros no intervalo {@code [inf, sup]}.
     *
     * <pre>
     *     ∑ f(i), para i = inf até sup
     * </pre>
     *
     * @param inf    limite inferior do somatório (inclusive)
     * @param sup    limite superior do somatório (inclusive)
     * @param funcao função a aplicar a cada valor de {@code i}
     * @return o resultado do somatório
     * @throws IllegalArgumentException se {@code inf > sup}
     */
    public static int calcular(int inf, int sup, ISomatorio funcao) {
        if (inf > sup) {
            throw new IllegalArgumentException("O limite inferior não pode ser maior que o limite superior.");
        }

        int resultado = 0;
        for (int i = inf; i <= sup; i++) {
            resultado += funcao.calcular_aux(i);
        }
        return resultado;
    }
}
