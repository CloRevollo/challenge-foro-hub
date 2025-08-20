package foro.hub.challenge.domain.topico;

import foro.hub.challenge.domain.curso.DatosCursos;
import foro.hub.challenge.domain.usuario.DatosUsuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        LocalDateTime fecha,
        @NotBlank
        String status,
        @NotNull @Valid
        DatosCursos curso,
        @NotNull @Valid
        DatosUsuario usuario
) {
}
