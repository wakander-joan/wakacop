package academy.wakanda.wakacop.sessaovotacao.application.repository;

import academy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import academy.wakanda.wakacop.sessaovotacao.infra.SessaoVotacaoSpringDataJPARepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
@Log4j2
public class SessaoVotacaoInfraRepository implements SessaoVotacaoRepository {
        private final SessaoVotacaoSpringDataJPARepository sessaoVotacaoSpringDataJPARepository;

    @Override
    public SessaoVotacao salva(SessaoVotacao sessaoVotacao ) {
        log.info("[start] SessaoVotacaoController - abreSessao");
        sessaoVotacaoSpringDataJPARepository.save(sessaoVotacao);
        log.info("[finish] SessaoVotacaoController - abreSessao");
        return sessaoVotacao;
    }

    @Override
    public SessaoVotacao buscaPorId(UUID idSessao) {
        log.info("[start] SessaoVotacaoController - buscaPorId");
       SessaoVotacao sessao = sessaoVotacaoSpringDataJPARepository.findById(idSessao)
               .orElseThrow(() -> new RuntimeException("Sessão não encontrada!"));
        return sessao;
    }
}
