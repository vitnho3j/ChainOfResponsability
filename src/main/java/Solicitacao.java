public class Solicitacao {

    private TipoSolicitacao tipoSolicitacao;

    public Solicitacao(TipoSolicitacao tiposolicitacao){
        this.tipoSolicitacao = tiposolicitacao;
    }

    public TipoSolicitacao getTipoSolicitacao() {
        return tipoSolicitacao;
    }

    public void setTipoSolicitacao(TipoSolicitacao tipoSolicitacao) {
        this.tipoSolicitacao = tipoSolicitacao;
    }
}
