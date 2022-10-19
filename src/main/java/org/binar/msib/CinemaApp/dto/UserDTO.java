package org.binar.msib.CinemaApp.dto;

import org.binar.msib.CinemaApp.entity.Orders;

import java.util.List;

public record UserDTO(Integer user_id, String username, String email, String password, List<Orders> orders) {
}
