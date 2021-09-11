package br.com.satty.writeam.modals;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Data
@Entity
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @Column(unique=true)
    private String login;

    @NotBlank
    private String senha;

    @NotBlank
    private String nome;

}
