package foro.hub.challenge.controller;

import foro.hub.challenge.domain.usuario.DatosAutentificacionUsuario;
import foro.hub.challenge.domain.usuario.Usuario;
import foro.hub.challenge.infra.security.DatosJWTToken;
import foro.hub.challenge.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutentificacionUsuario datosAutenticacionUsuario) {
        Authentication authToken = new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.correo(),
                datosAutenticacionUsuario.password());
        System.out.println("Intentando autenticar usuario: " + datosAutenticacionUsuario.correo());
        System.out.println("Con token: " + authToken);
        var usuarioAutenticado = authenticationManager.authenticate(authToken);
        System.out.println("Usuario autenticado: " + usuarioAutenticado.getName());
        var JWTtoken = tokenService.generarToken((Usuario) usuarioAutenticado.getPrincipal());
        return ResponseEntity.ok(new DatosJWTToken(JWTtoken));
    }
}
