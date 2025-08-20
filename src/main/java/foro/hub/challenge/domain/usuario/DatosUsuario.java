package foro.hub.challenge.domain.usuario;

import jakarta.validation.constraints.NotNull;

public record DatosUsuario(
        @NotNull Long id
) {
}
