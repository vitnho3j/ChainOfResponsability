public class TipoSolicitacaoTelefone implements TipoSolicitacao{

    private static  TipoSolicitacaoTelefone tipoSolicitacaoTelefone = new TipoSolicitacaoTelefone();

    private TipoSolicitacaoTelefone(){};

    public static TipoSolicitacaoTelefone getTipoSolicitacaoTelefone(){
        return tipoSolicitacaoTelefone;
    }

}
