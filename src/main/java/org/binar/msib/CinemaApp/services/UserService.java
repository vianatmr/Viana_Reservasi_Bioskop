package org.binar.msib.CinemaApp.services;

import org.binar.msib.CinemaApp.entity.EntityUser;
import org.binar.msib.CinemaApp.entity.Film;

public interface UserService {
    public void insertUser(EntityUser entityUser);
    public EntityUser updateUser(EntityUser entityUser, Integer user_id);
    public Integer delete (Integer user_id);
}
