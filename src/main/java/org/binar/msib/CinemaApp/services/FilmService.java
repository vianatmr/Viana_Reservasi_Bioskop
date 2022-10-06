package org.binar.msib.CinemaApp.services;

import org.binar.msib.CinemaApp.entity.Film;
import org.binar.msib.CinemaApp.entity.Schedule;

import java.util.List;

public interface FilmService {
    public void insertFilm(Film film);
    public List<Film> getAllFilm();
    public Film updateFilm(Film film, Integer film_code);
    public Integer delete (Integer film_code);
    public Schedule getSchedule (int film_code);
}
