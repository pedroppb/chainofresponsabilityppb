package chainofresponsabilityppb;

public class FuncionarioTecSoftware extends Funcionario {
    public FuncionarioTecSoftware(Funcionario superior) {
        listaTiposPedidos.add(PedidoManutencaoSoftware.getPedidoManutencaoSoftware());
        setFuncionarioSuperior(superior);
    }
    public String getDescricaoCargo() {
        return "manutençao feita por Tecnico de software";
    }
}
