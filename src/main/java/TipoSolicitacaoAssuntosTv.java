public class TipoSolicitacaoAssuntosTv implements TipoSolicitacao{

    private static  TipoSolicitacaoAssuntosTv tipoSolicitacaoAssuntosTv = new TipoSolicitacaoAssuntosTv();

    private TipoSolicitacaoAssuntosTv(){};

    public static TipoSolicitacaoAssuntosTv getTipoSolicitacaoAssuntosTv(){
        return tipoSolicitacaoAssuntosTv;
    }


}
