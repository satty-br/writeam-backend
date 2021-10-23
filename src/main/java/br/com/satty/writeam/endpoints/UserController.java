package br.com.satty.writeam.endpoints;

import br.com.satty.writeam.dtos.UserDTO;
import br.com.satty.writeam.services.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.sql.SQLException;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    final
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PutMapping
    public UserDTO createUser(@RequestBody UserDTO UserDTO) {
        try {
            return userService.createUser(UserDTO);
        } catch (Exception e) {
            if (e.getMessage().toLowerCase().contains("login")) {
                throw new RuntimeException("Login já existe");
            } else {
                throw new RuntimeException("Erro ao inserir User");
            }
        }
    }

    @PostMapping
    public UserDTO updateUser(@RequestBody UserDTO UserDTO) {
        try {
            return userService.updateUser(UserDTO);
        } catch (Exception e) {
           throw new RuntimeException("Error on update user");
        }
    }




    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Page<UserDTO>> listarUsers(@NotNull final Pageable pageable) {
        return ResponseEntity.ok(userService.getUsers(pageable));
    }
}

