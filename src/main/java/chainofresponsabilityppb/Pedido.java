package chainofresponsabilityppb;

public class Pedido {
    private IPedido pedido;
    public Pedido(IPedido pedido) {
        this.pedido = pedido;
    }
    public IPedido getPedido() {
        return pedido;
    }
    public void setPedido(IPedido pedido) {
        this.pedido = pedido;
    }
}