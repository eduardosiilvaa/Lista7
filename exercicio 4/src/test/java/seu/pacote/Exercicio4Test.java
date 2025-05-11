import org.junit.Test;
import static org.junit.Assert.*;

public class Exercicio4Test {
    @Test
    public void testConversao() {
        assertEquals(10.0, Exercicio4.converterParaCelsius(50.0), 0.001);
    }
}
