import org.junit.Test;
import static org.junit.Assert.*;

public class Exercicio1Test {

    @Test
    public void testValidarNome() {
        String nome = "";
        assertFalse("Nome não pode ser vazio.", nome.isEmpty());
    }

    @Test
    public void testValidarCpf() {
        String cpf = "12345678901";
        assertEquals("CPF deve ter 11 dígitos.", 11, cpf.length());
    }

    @Test
    public void testValidarIdade() {
        int idade = 25;
        assertTrue("Idade deve estar entre 0 e 120.", idade >= 0 && idade <= 120);
    }
}
