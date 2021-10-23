package br.com.satty.writeam.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class UserDTO {
    private Long id;
    private String login;
    private String password;
    private String name;
    private String email;
    private String biography;
    private Long idAdress;
    private String title;
    private String photo;
    private Date dtCrete;
}
