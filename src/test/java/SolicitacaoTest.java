import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolicitacaoTest {

    SetorCadastroPlano cadastroPlano;
    SetorCancelamento cancelamento;
    SetorAssuntosTv assuntosTv;
    SetorAssuntosInternet assuntosInternet;

    @BeforeEach
    void setUp(){
        cancelamento = new SetorCancelamento(null);
        assuntosTv = new SetorAssuntosTv(cancelamento);
        assuntosInternet = new SetorAssuntosInternet(assuntosTv);
        cadastroPlano = new SetorCadastroPlano(assuntosInternet);
    }

    @Test
    void deveRetornarSetorCancelamentoParaSolicitacaoCancelamento(){
        assertEquals("Cancelamento", cadastroPlano.gerenciarSolicitacao(new Solicitacao(TipoSolicitacaoCancelamento.getTipoSolicitacaoCancelamento())));
    }

    @Test
    void deveRetornarAssuntosInternetParaSolicitacaoInternet(){
        assertEquals("Assuntos Internet", cadastroPlano.gerenciarSolicitacao(new Solicitacao(TipoSolicitacaoAssuntosInternet.getTipoSolicitacaoAssuntosInternet())));
    }

    @Test
    void deveRetornarAssuntosTvParaSolicitacaoTv(){
        assertEquals("Assuntos TV", cadastroPlano.gerenciarSolicitacao(new Solicitacao(TipoSolicitacaoAssuntosTv.getTipoSolicitacaoAssuntosTv())));
    }

    @Test
    void deveRetornarSetorCadastroPlanoParaSolicitacaoAdquirirPlano(){
        assertEquals("Cadastro Plano", cadastroPlano.gerenciarSolicitacao(new Solicitacao(TipoSolicitacaoAdquirirPlano.getTipoSolicitacaoAdquirirPlano())));
    }

    @Test
    void deveRetornarSemSetorParaSolicitacaoTelefone(){
        assertEquals("Sem setor", cadastroPlano.gerenciarSolicitacao(new Solicitacao(TipoSolicitacaoTelefone.getTipoSolicitacaoTelefone())));
    }

}
