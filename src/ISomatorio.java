/**
 * Interface funcional que representa uma função a aplicar num somatório.
 * <p>
 * Implementações desta interface definem a lógica da função {@code f(i)},
 * onde {@code i} é um número inteiro.
 * </p>
 *
 * <p>
 * Esta interface é utilizada pela classe {@link Somatorio} para permitir
 * que diferentes projetos forneçam funções distintas sem alterar o
 * framework.
 * </p>
 */
@FunctionalInterface
public interface ISomatorio {

    /**
     * Aplica a função ao valor fornecido.
     *
     * @param i valor inteiro sobre o qual a função é aplicada
     * @return resultado da função para o valor {@code i}
     */
    int calcular_aux(int i);
}
