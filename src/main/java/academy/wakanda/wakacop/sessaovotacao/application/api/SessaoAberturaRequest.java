package academy.wakanda.wakacop.sessaovotacao.application.api;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.ToString;

import java.util.Optional;
import java.util.UUID;

@Getter
@ToString
public class SessaoAberturaRequest {
    @NotNull
    private UUID idPauta;
    private Integer tempoduracao;

    public Optional<Integer> getTempoDuracao () {
        return Optional.ofNullable(this.tempoduracao);
    }
}
