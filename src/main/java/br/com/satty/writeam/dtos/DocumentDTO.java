package br.com.satty.writeam.dtos;

import br.com.satty.writeam.DocumentType;
import lombok.Data;

@Data
public class DocumentDTO {
    // Referencia ao usuario
    private Long idAuthor;

    private String title;
    private String description;
    private DocumentType type;
    private String login;
    private String name;
    private String text;


}
