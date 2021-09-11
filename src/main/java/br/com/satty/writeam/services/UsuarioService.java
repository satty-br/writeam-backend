package br.com.satty.writeam.services;


import br.com.satty.writeam.cruds.UsuarioCrud;
import br.com.satty.writeam.dtos.UsuarioDTO;
import br.com.satty.writeam.modals.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    final
    UsuarioCrud usuarioCrud;

    public UsuarioService(UsuarioCrud usuarioCrud) {
        this.usuarioCrud = usuarioCrud;
    }

    public UsuarioDTO criarUsuario(UsuarioDTO usuarioDTO){
        return entityToDto(usuarioCrud.save(dtoToEntity(usuarioDTO)));
    }

    private UsuarioDTO entityToDto(Usuario usuario) {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setLogin(usuario.getLogin());
        usuarioDTO.setSenha(usuario.getSenha());
        usuarioDTO.setNome(usuario.getNome());
        return usuarioDTO;
    }

    public Usuario dtoToEntity(UsuarioDTO usuarioDTO){
        Usuario usuario = new Usuario();
        usuario.setLogin(usuarioDTO.getLogin());
        usuario.setSenha(usuarioDTO.getSenha());
        usuario.setNome(usuarioDTO.getNome());
        return usuario;
    }

    public Page<UsuarioDTO> buscarUSuarios(Pageable pageable) {
        return usuarioCrud.findAll(pageable).map(this::entityToDto);
    }
}
