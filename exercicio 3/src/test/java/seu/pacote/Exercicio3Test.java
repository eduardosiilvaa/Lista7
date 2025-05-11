import org.junit.Test;
import static org.junit.Assert.*;

public class Exercicio3Test {
    @Test
    public void testCalcularAumento() {
        assertEquals(55.0, Exercicio3.calcularAumento(50.0), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testValorInvalido() {
        Exercicio3.calcularAumento(0);
    }
}
