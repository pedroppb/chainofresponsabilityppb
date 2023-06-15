package chainofresponsabilityppb;

public class TipoDocumentacaoOrcamento {
    private static TipoDocumentacaoOrcamento tipoDocoumentoOrcamento = new TipoDocumentacaoOrcamento();
    private TipoDocumentacaoOrcamento() {};
    public static TipoDocumentacaoOrcamento getTipoDocoumentoOrcamento() {
        return tipoDocoumentoOrcamento;
    }
}
