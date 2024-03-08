package academy.wakanda.wakacop.sessaovotacao.application.api;

import academy.wakanda.wakacop.sessaovotacao.domain.SessaoVotacao;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
public class SessaoAberturaResponse {
    private UUID id;

    public SessaoAberturaResponse(SessaoVotacao sessaoVotacao) {
        this.id = sessaoVotacao.getId();
    }
}
