public class TipoSolicitacaoAssuntosInternet implements TipoSolicitacao{

    private static  TipoSolicitacaoAssuntosInternet tipoSolicitacaoAssuntosInternet = new TipoSolicitacaoAssuntosInternet();

    private TipoSolicitacaoAssuntosInternet(){};

    public static TipoSolicitacaoAssuntosInternet getTipoSolicitacaoAssuntosInternet(){
        return tipoSolicitacaoAssuntosInternet;
    }


}
