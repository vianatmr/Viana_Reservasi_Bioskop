package org.binar.msib.CinemaApp.services;

import org.binar.msib.CinemaApp.dto.UserDTO;
import org.binar.msib.CinemaApp.entity.EntityUser;

public interface UserService {
    public EntityUser insertUser(EntityUser entityUser);
    public EntityUser updateUser(EntityUser entityUser, Integer user_id);
    public Integer delete (Integer user_id);

    UserDTO mapToDto(EntityUser entityUser);
    EntityUser mapToEntity(UserDTO userDTO);
}
