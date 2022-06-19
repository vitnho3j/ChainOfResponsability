public class SetorCadastroPlano extends Setor{

    public SetorCadastroPlano(Setor responsavel){
        listaSolicitacoes.add(TipoSolicitacaoAdquirirPlano.getTipoSolicitacaoAdquirirPlano());
        setSetorResponsavel(responsavel);
    }

    public String getDescricaoSetor(){
        return "Cadastro Plano";
    }

}
