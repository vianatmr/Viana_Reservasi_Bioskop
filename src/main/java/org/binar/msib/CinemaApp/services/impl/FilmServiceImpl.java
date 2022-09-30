package org.binar.msib.CinemaApp.services.impl;

import org.binar.msib.CinemaApp.entity.Film;
import org.binar.msib.CinemaApp.repository.FilmRepository;
import org.binar.msib.CinemaApp.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    FilmRepository filmRepository;
    @Override
    public void insertFilm(Film film) {
        filmRepository.save(film);
    }

    @Override
    public List<Film> getAllFilm() {
        return filmRepository.findAll();
    }
}
