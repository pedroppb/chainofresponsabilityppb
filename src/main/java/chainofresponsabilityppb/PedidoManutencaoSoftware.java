package chainofresponsabilityppb;

public class PedidoManutencaoSoftware implements IPedido{
    private static PedidoManutencaoSoftware pedidoManutencaoSoftware = new PedidoManutencaoSoftware();
    private PedidoManutencaoSoftware() {};
    public static PedidoManutencaoSoftware getPedidoManutencaoSoftware() {
        return pedidoManutencaoSoftware;
    }
}
