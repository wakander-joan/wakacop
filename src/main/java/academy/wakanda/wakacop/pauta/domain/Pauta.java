package academy.wakanda.wakacop.pauta.domain;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.ToString;

import java.util.UUID;

@Getter
@ToString
@Entity
public class Pauta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "uuid", updatable = false, unique = true, nullable = false)
    private UUID id;
    private String titulo;
    private String descricao;
    private UUID idAssociadoAutor;
    private LocalDateTime dataCriacao;
}