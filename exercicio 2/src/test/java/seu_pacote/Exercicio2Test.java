package test.java.seu_pacote;

import org.junit.Test;

import main.java.seu_pacote.Exercicio2;

import static org.junit.Assert.*;

public class Exercicio2Test {
    @Test
    public void testCalcularMedia() {
        assertEquals(15.0, Exercicio2.calcularMedia(10, 20), 0.001);
    }
}
