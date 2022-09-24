package org.binar.msib.CinemaApp.repository;

import org.binar.msib.CinemaApp.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmRepository extends JpaRepository<Film,Integer> {
}
