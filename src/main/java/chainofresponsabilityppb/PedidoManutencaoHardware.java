package chainofresponsabilityppb;

public class PedidoManutencaoHardware implements IPedido{
    private static PedidoManutencaoHardware pedidoManutencaoHardware = new PedidoManutencaoHardware();
    private PedidoManutencaoHardware() {};
    public static PedidoManutencaoHardware getPedidoManutencaoHardware() {
        return pedidoManutencaoHardware;
    }
}
