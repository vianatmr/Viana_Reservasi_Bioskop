package org.binar.msib.CinemaApp.services;

import org.binar.msib.CinemaApp.dto.FilmDTO;
import org.binar.msib.CinemaApp.entity.Film;
import org.binar.msib.CinemaApp.entity.Schedule;

import java.util.List;

public interface FilmService {
    public Film insertFilm(Film film);
    public List<Film> getAllFilm();
    public Film updateFilm(Film film, Integer film_code);
    public Boolean delete (Integer film_code);
    public Schedule getSchedule (Integer film_code);
    public Film findById (Integer film_code);

    FilmDTO mapToDto(Film film);
    Film mapToEntity(FilmDTO filmDTO);

}
