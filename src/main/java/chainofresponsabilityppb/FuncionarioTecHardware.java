package chainofresponsabilityppb;

public class FuncionarioTecHardware extends Funcionario {
    public FuncionarioTecHardware(Funcionario superior) {
        listaTiposPedidos.add(PedidoManutencaoHardware.getPedidoManutencaoHardware());
        setFuncionarioSuperior(superior);
    }
    public String getDescricaoCargo() {
        return "manutençao feita por Tecnico de hardware";
    }
}
