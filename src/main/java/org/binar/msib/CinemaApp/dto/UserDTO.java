package org.binar.msib.CinemaApp.dto;

import org.binar.msib.CinemaApp.entity.Orders;

import java.util.List;
import java.util.Objects;

public final class UserDTO {
    private final Integer user_id;
    private final String username;
    private final String email;
    private final String password;

    UserDTO(Integer user_id, String username, String email, String password) {
        this.user_id = user_id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public Integer user_id() {
        return user_id;
    }

    public String username() {
        return username;
    }

    public String email() {
        return email;
    }

    public String password() {
        return password;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        UserDTO that = (UserDTO) obj;
        return Objects.equals(this.user_id, that.user_id) &&
                Objects.equals(this.username, that.username) &&
                Objects.equals(this.email, that.email) &&
                Objects.equals(this.password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, username, email, password);
    }

    @Override
    public String toString() {
        return "UserDTO[" +
                "user_id=" + user_id + ", " +
                "username=" + username + ", " +
                "email=" + email + ", " +
                "password=" + password + ']';
    }
}

