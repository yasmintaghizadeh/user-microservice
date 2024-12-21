package org.example.user.adaptor;

import org.example.user.dto.UserDTO;
import org.example.user.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserAdaptor {
    User convertDto(UserDTO userDTO);

    UserDTO convertEntity(User user);

}
