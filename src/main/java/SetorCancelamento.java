public class SetorCancelamento extends Setor{

    public SetorCancelamento(Setor responsavel){
        listaSolicitacoes.add(TipoSolicitacaoCancelamento.getTipoSolicitacaoCancelamento());
        setSetorResponsavel(responsavel);
    }

    public String getDescricaoSetor(){
        return "Cancelamento";
    }

}
