import org.example.FabricaAbstrata;
import org.example.FabricaAbstrataFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FabricaAbstrataFactoryTest {
    @Test
    void deveRetornarExcecaoParaFabricaInexistente() {
        try {
            FabricaAbstrata fabrica = FabricaAbstrataFactory.getInstance().obterFabrica("Evasao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Fábrica inexistente", e.getMessage());
        }
    }
}
