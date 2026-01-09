/**
 * Classe cliente que demonstra a utilização do método genérico de somatório
 * disponibilizado pelo framework.
 */
public class ClientApp {

    public static void main(String[] args) {

        int inf = 1;
        int sup = 10;

        // Define a função f(i) = 4 + sin(i), considerando apenas valores inteiros
        ISomatorio funcao = i -> 4 + (int) Math.sin(i);

        int resultado = Somatorio.calcular(inf, sup, funcao);

        System.out.println("Resultado do somatório: " + resultado);
    }
}

