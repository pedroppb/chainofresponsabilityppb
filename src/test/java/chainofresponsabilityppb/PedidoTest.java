package chainofresponsabilityppb;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PedidoTest {
    FuncionarioTecHardware tecHardware;
    FuncionarioTecSoftware tecSoftware;
    FuncionarioAtendente atendente;
    @BeforeEach
    void setUp() {
        tecHardware = new FuncionarioTecHardware(null);
        tecSoftware = new FuncionarioTecSoftware(tecHardware);
        atendente = new FuncionarioAtendente(tecSoftware);
    }

    @Test
    void deveRetornaratendendeParaVendaProduto() {
        assertEquals("Venda feita por atendende", atendente.assinarPedido(new Pedido(PedidoProduto.getPedidoProduto())));
    }

    @Test
    void deveRetornarTecSoftwareParaManutencaoSoftware() {
        assertEquals("manutençao feita por Tecnico de software", atendente.assinarPedido(new Pedido(PedidoManutencaoSoftware.getPedidoManutencaoSoftware())));
    }

    @Test
    void deveRetornarTechardwareParaManutencaoHardware() {
        assertEquals("manutençao feita por Tecnico de hardware", atendente.assinarPedido(new Pedido(PedidoManutencaoHardware.getPedidoManutencaoHardware())));
    }

    @Test
    void deveRetornarSemAssinaturaParaPedidoCancelado() {
        assertEquals("Sem assinatura", atendente.assinarPedido(new Pedido(PedidoCancelado.getPedidoCancelado())));
    }
}
