package br.com.satty.writeam.modals;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@Entity
public class User {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @Column(unique=true)
    private String login;

    @NotBlank
    private String password;

    @NotBlank
    private String name;

    @Email
    private String email;

    private String biography;

    private String photo;

    private String title;

    private Long idAdress;

    private Date dtCreate;

}
