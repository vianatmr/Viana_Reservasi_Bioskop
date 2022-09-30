package org.binar.msib.CinemaApp.services;

import org.binar.msib.CinemaApp.entity.Film;

import java.util.List;

public interface FilmService {
    public void insertFilm(Film film);
    public List<Film> getAllFilm();


}
