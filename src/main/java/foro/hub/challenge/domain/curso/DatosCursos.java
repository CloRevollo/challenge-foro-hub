package foro.hub.challenge.domain.curso;

import jakarta.validation.constraints.NotNull;

public record DatosCursos(
        @NotNull Long id
) {
}
