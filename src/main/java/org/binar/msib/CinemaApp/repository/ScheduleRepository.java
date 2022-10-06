package org.binar.msib.CinemaApp.repository;

import org.binar.msib.CinemaApp.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScheduleRepository extends JpaRepository<Schedule, Integer> {
}
