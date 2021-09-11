package br.com.satty.writeam.dtos;

import lombok.Data;

@Data
public class UsuarioDTO {
    private String login;
    private String senha;
    private String nome;
}
