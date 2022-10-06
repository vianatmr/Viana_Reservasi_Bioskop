package org.binar.msib.CinemaApp.repository;

import org.binar.msib.CinemaApp.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}
