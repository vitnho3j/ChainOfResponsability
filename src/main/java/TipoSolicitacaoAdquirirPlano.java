public class TipoSolicitacaoAdquirirPlano implements TipoSolicitacao{

    private static  TipoSolicitacaoAdquirirPlano tipoSolicitacaoAdquirirPlano = new TipoSolicitacaoAdquirirPlano();

    private TipoSolicitacaoAdquirirPlano(){};

    public static TipoSolicitacaoAdquirirPlano getTipoSolicitacaoAdquirirPlano(){
        return tipoSolicitacaoAdquirirPlano;
    }


}
