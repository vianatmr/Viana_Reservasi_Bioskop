package org.binar.msib.CinemaApp.services.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.binar.msib.CinemaApp.dto.UserDTO;
import org.binar.msib.CinemaApp.entity.EntityUser;
import org.binar.msib.CinemaApp.entity.Film;
import org.binar.msib.CinemaApp.repository.EntityUserRepository;
import org.binar.msib.CinemaApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    EntityUserRepository entityUserRepository;

    @Override
    public EntityUser insertUser(EntityUser entityUser) {
        EntityUser result = entityUserRepository.save(entityUser);
        return result;
    }

    @Override
    public EntityUser updateUser(EntityUser entityUser, Integer user_id) {
        EntityUser entityUserDB = entityUserRepository.findById(entityUser.getUser_id()).orElse(null);
        entityUserDB.setEmail(entityUser.getEmail());
        entityUserDB.setPassword(entityUser.getPassword());
        entityUser.setOrders(entityUser.getOrders());
        entityUser.setUsername(entityUser.getUsername());
        return entityUserRepository.save(entityUserDB);
    }

    @Override
    public Integer delete(Integer user_id) {
        EntityUser entityUserDB = entityUserRepository.findById(user_id).orElse(null);
        entityUserRepository.delete(entityUserDB);
        return user_id;
    }
    ObjectMapper mapper = new ObjectMapper();
    @Override
    public UserDTO mapToDto(EntityUser entityUser) {
        return mapper.convertValue(entityUser, UserDTO.class);
    }

    @Override
    public EntityUser mapToEntity(UserDTO userDTO) {
        return mapper.convertValue(userDTO, EntityUser.class);
    }

}
