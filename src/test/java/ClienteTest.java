import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveEmitirContratoPJ() {
        FabricaAbstrata fabrica = FabricaAbstrataFactory.getInstance().obterFabrica("PJ");
        Cliente aluno = new Cliente(fabrica);
        assertEquals("Contrato PJ", aluno.emitirContrato());
    }

    @Test
    void deveEmitirContratoPF() {
        FabricaAbstrata fabrica = FabricaAbstrataFactory.getInstance().obterFabrica("PF");
        Cliente aluno = new Cliente(fabrica);
        assertEquals("Contrato PF", aluno.emitirContrato());
    }

    @Test
    void deveEmitirProcuracaoPJ() {
        FabricaAbstrata fabrica = FabricaAbstrataFactory.getInstance().obterFabrica("PJ");
        Cliente aluno = new Cliente(fabrica);
        assertEquals("Procuracao PJ", aluno.emitirProcuracao());
    }

    @Test
    void deveEmitirProcuracaoPF() {
        FabricaAbstrata fabrica = FabricaAbstrataFactory.getInstance().obterFabrica("PF");
        Cliente aluno = new Cliente(fabrica);
        assertEquals("Procuracao PF", aluno.emitirProcuracao());
    }

}