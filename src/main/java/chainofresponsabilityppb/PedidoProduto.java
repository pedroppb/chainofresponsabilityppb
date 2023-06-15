package chainofresponsabilityppb;

public class PedidoProduto implements IPedido {
    private static PedidoProduto pedidoProduto = new PedidoProduto();
    private PedidoProduto() {};
    public static PedidoProduto getPedidoProduto() {
        return pedidoProduto;
    }
}
