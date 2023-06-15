package chainofresponsabilityppb;
import java.util.ArrayList;

public abstract class Funcionario {
    protected ArrayList listaTiposPedidos = new ArrayList();
    private Funcionario funcionarioSuperior;
    public Funcionario getFuncionarioSuperior() {
        return funcionarioSuperior;
    }
    public void setFuncionarioSuperior(Funcionario funcionarioSuperior) {
        this.funcionarioSuperior = funcionarioSuperior;
    }

    public abstract String getDescricaoCargo();

    public String assinarPedido(Pedido pedido) {
        if (listaTiposPedidos.contains(pedido.getPedido())) {
            return getDescricaoCargo();
        }
        else {
            if (funcionarioSuperior != null) {
                return funcionarioSuperior.assinarPedido(pedido);
            }
            else
            {
                return "Sem assinatura";
            }
        }
    }
}
