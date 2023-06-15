package chainofresponsabilityppb;

public class PedidoCancelado implements IPedido{
    private static PedidoCancelado pedidoCancelado = new PedidoCancelado();
    private PedidoCancelado() {};
    public static PedidoCancelado getPedidoCancelado() {
        return pedidoCancelado;
    }

}
