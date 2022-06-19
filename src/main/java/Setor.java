import java.util.ArrayList;

public abstract class Setor {

    protected ArrayList listaSolicitacoes = new ArrayList();

    private Setor setorResponsavel;

    public Setor getSetorResponsavel(){
        return setorResponsavel;
    }

    public void setSetorResponsavel(Setor setorResponsavel){
        this.setorResponsavel = setorResponsavel;
    }

    public abstract String getDescricaoSetor();

    public String gerenciarSolicitacao(Solicitacao solicitacao){
        if(listaSolicitacoes.contains(solicitacao.getTipoSolicitacao())){
            return getDescricaoSetor();
        }
        else {
            if (setorResponsavel != null){
                return setorResponsavel.gerenciarSolicitacao(solicitacao);
            }
            else{
                return "Sem setor";
            }
        }
    }

}
