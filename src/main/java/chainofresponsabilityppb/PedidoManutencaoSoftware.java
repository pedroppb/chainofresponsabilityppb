package chainofresponsabilityppb;

public class TipoDocumentacaoMaterial {
    private static TipoDocumentacaoMaterial tipoDocoumentoMaterial = new TipoDocumentacaoMaterial();
    private TipoDocumentacaoMaterial() {};
    public static TipoDocumentacaoMaterial getTipoDocoumentoMaterial() {
        return tipoDocoumentoMaterial;
    }
}
