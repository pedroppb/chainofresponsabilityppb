package chainofresponsabilityppb;

public class FuncionarioAtendente extends  Funcionario{
    public FuncionarioAtendente(Funcionario superior) {
        listaTiposPedidos.add(PedidoProduto.getPedidoProduto());
        setFuncionarioSuperior(superior);
    }
    public String getDescricaoCargo() {
        return "Venda feita por atendende";
    }
}
