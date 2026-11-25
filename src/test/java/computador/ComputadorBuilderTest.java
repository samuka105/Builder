package computador;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ComputadorBuilderTest {

    @Test
    public void testBuildValido() {
        Computador pc = new ComputadorBuilder()
                .setProcessador("Ryzen 5")
                .setMemoriaGB(16)
                .build();
        assertEquals("Ryzen 5", pc.getProcessador());
        assertEquals(16, pc.getMemoriaGB());
    }

    @Test
    public void testBuildSemProcessadorLancaExcecao() {
        ComputadorBuilder builder = new ComputadorBuilder().setMemoriaGB(16);
        assertThrows(IllegalArgumentException.class, () -> builder.build());
    }

    @Test
    public void testBuildComMemoriaZeroLancaExcecao() {
        ComputadorBuilder builder = new ComputadorBuilder().setProcessador("Ryzen 5");
        assertThrows(IllegalArgumentException.class, () -> builder.build());
    }

    @Test
    public void testMensagemDeErroDoProcessador() {
        ComputadorBuilder builder = new ComputadorBuilder().setMemoriaGB(16);
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> builder.build());
        assertEquals("Processador é obrigatório", e.getMessage());
    }

    @Test
    public void testCamposOpcionaisPodemFicarVazios() {
        Computador pc = new ComputadorBuilder()
                .setProcessador("Core i5")
                .setMemoriaGB(8)
                .build();
        assertNull(pc.getPlacaVideo());
        assertNull(pc.getArmazenamento());
        assertEquals(0, pc.getFonteWatts());
    }

    @Test
    public void testEncadeamentoDefineTodosOsCampos() {
        Computador pc = new ComputadorBuilder()
                .setProcessador("Ryzen 7")
                .setMemoriaGB(32)
                .setArmazenamento("SSD 1TB")
                .setPlacaVideo("RTX 4070")
                .setFonteWatts(750)
                .setGabinete("Mid Tower")
                .setSistemaOperacional("Linux")
                .build();
        assertEquals("SSD 1TB", pc.getArmazenamento());
        assertEquals("RTX 4070", pc.getPlacaVideo());
        assertEquals(750, pc.getFonteWatts());
        assertEquals("Linux", pc.getSistemaOperacional());
    }

    @Test
    public void testSetterRetornaOProprioBuilder() {
        ComputadorBuilder builder = new ComputadorBuilder();
        assertSame(builder, builder.setProcessador("Core i7"));
    }
}
