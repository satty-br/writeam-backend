package br.com.satty.writeam.endpoints;

import br.com.satty.writeam.dtos.UsuarioDTO;
import br.com.satty.writeam.services.UsuarioService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.sql.SQLException;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {

    final
    UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PutMapping
    public UsuarioDTO criarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        try {
            return usuarioService.criarUsuario(usuarioDTO);
        } catch (Exception e) {
            if (e.getMessage().toLowerCase().contains("login")) {
                throw new RuntimeException("Login já existe");
            } else {
                throw new RuntimeException("Erro ao inserir usuario");
            }
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Page<UsuarioDTO>> listarUsuarios(@NotNull final Pageable pageable) {
        return ResponseEntity.ok(usuarioService.buscarUSuarios(pageable));
    }
}

