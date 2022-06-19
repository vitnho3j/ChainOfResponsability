public class SetorAssuntosTv extends Setor{

    public SetorAssuntosTv(Setor responsavel){
        listaSolicitacoes.add(TipoSolicitacaoAssuntosTv.getTipoSolicitacaoAssuntosTv());
        setSetorResponsavel(responsavel);
    }

    public String getDescricaoSetor(){
        return "Assuntos TV";
    }

}
