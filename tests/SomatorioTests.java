import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SomatorioTests {

    @Test
    void calcularSomatorioSimples() {
        int resultado = Somatorio.calcular(1, 3, i -> i);
        assertEquals(6, resultado); // 1 + 2 + 3
    }

    @Test
    void calcularSomatorioComFuncaoConstante() {
        int resultado = Somatorio.calcular(1, 4, i -> 5);
        assertEquals(20, resultado);
    }

    @Test
    void excecaoQuandoIntervaloInvalido() {
        assertThrows(IllegalArgumentException.class, () ->
                Somatorio.calcular(5, 1, i -> i)
        );
    }
}
