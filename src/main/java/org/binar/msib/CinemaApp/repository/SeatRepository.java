package org.binar.msib.CinemaApp.repository;

import org.binar.msib.CinemaApp.entity.Seat;
import org.binar.msib.CinemaApp.entity.SeatPKId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, SeatPKId> {
}
