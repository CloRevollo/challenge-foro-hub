package foro.hub.challenge.domain.topico;

import foro.hub.challenge.domain.curso.DatosCursos;
import foro.hub.challenge.domain.usuario.DatosUsuario;

import java.time.LocalDateTime;

public record DatosListaTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fecha,
        String status,
        DatosCursos curso,
        DatosUsuario usuario
) {
    public DatosListaTopico(Topico topico) {
        this(topico.getId(),
                topico.getTitulo(),
                topico.getMensaje(),
                topico.getFecha(),
                topico.getStatus(),
                new DatosCursos(topico.getCurso().getId()),
                new DatosUsuario(topico.getUsuario().getId()));
    }
}
