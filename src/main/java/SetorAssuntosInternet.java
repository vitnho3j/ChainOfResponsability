public class SetorAssuntosInternet extends Setor{

    public SetorAssuntosInternet(Setor responsavel){
        listaSolicitacoes.add(TipoSolicitacaoAssuntosInternet.getTipoSolicitacaoAssuntosInternet());
        setSetorResponsavel(responsavel);
    }

    public String getDescricaoSetor(){
        return "Assuntos Internet";
    }

}
