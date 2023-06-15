package chainofresponsabilityppb;

public class TipoDocumentacaoApresentacao implements TipoDocumentacao {
    private static TipoDocumentacaoApresentacao tipoDcoumentoApresentacao = new TipoDocumentacaoApresentacao();
    private TipoDocumentacaoApresentacao() {};
    public static TipoDocumentacaoApresentacao getTipoDcoumentoApresentacao() {
        return tipoDcoumentoApresentacao;
    }
}
