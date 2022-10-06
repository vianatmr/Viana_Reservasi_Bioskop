package org.binar.msib.CinemaApp.services.impl;

import org.binar.msib.CinemaApp.entity.Film;
import org.binar.msib.CinemaApp.entity.Schedule;
import org.binar.msib.CinemaApp.repository.FilmRepository;
import org.binar.msib.CinemaApp.repository.ScheduleRepository;
import org.binar.msib.CinemaApp.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    FilmRepository filmRepository;
    ScheduleRepository scheduleRepository;
    @Override
    public void insertFilm(Film film) {
        filmRepository.save(film);
    }

    @Override
    public List<Film> getAllFilm() {
        return filmRepository.findAll();
    }

    @Override
    public Film updateFilm(Film film, Integer film_code) {
        Film filmDB = filmRepository.findById(film.getFilm_code()).orElse(null);
        filmDB.setFilm_name(film.getFilm_name());
        filmDB.setFilm_status(film.getFilm_status());
        filmDB.setPrice(film.getPrice());
        return filmRepository.save(filmDB);
    }

    @Override
    public Integer delete(Integer film_code) {
        Film filmDB = filmRepository.findById(film_code).orElse(null);
        filmRepository.delete(filmDB);
        return film_code;
    }

    @Override
    public Schedule getSchedule(int film_code) {
        return scheduleRepository.findById(film_code).orElse(null);
    }


}
