package br.com.satty.writeam.services;
/*

import br.com.satty.writeam.cruds.UserCrud;
import br.com.satty.writeam.cruds.UserCrud;
import br.com.satty.writeam.dtos.UserDTO;
import br.com.satty.writeam.modals.User;
import br.com.satty.writeam.modals.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.validation.constraints.Email;
import java.util.Date;
import java.util.Optional;

@Service
public class UserService {

    final
    UserCrud userCrud;

    public UserService(UserCrud userCrud) {
        this.userCrud = userCrud;
    }

    public UserDTO updateUser(UserDTO userDTO){
        Optional<User> usuarioOpt = userCrud.findById(userDTO.getId());
        if(usuarioOpt.isPresent()){
            User user = usuarioOpt.get();
            user.setName(userDTO.getName());
            user.setBiography(userDTO.getBiography());
            user.setIdAdress(userDTO.getIdAdress());
            user.setTitle(userDTO.getTitle());
            user.setPhoto(userDTO.getPhoto());
            return entityToDto(userCrud.save(user));
        }
        throw  new RuntimeException("User not found");
    }


    public UserDTO createUser(UserDTO userDTO){
        return entityToDto(userCrud.save(dtoToEntity(userDTO)));
    }

    private UserDTO entityToDto(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setLogin(user.getLogin());
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setEmail(user.getEmail());
        userDTO.setBiography(user.getBiography());
        userDTO.setIdAdress(user.getIdAdress());
        userDTO.setTitle(user.getTitle());
        userDTO.setPhoto(user.getPhoto());
        userDTO.setDtCrete(user.getDtCreate());
        return userDTO;
    }

    public User dtoToEntity(UserDTO userDTO){
        User user = new User();
        user.setLogin(userDTO.getLogin());
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setBiography(userDTO.getBiography());
        user.setIdAdress(userDTO.getIdAdress());
        user.setTitle(userDTO.getTitle());
        user.setPhoto(userDTO.getPhoto());
        return user;
    }

    public Page<UserDTO> getUsers(Pageable pageable) {
        return userCrud.findAll(pageable).map(this::entityToDto);
    }
}
*/