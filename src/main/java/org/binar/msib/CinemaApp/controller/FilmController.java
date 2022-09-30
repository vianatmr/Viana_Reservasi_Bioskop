package org.binar.msib.CinemaApp.controller;

import org.binar.msib.CinemaApp.entity.Film;
import org.binar.msib.CinemaApp.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/film")
public class FilmController {
    @Autowired
    FilmService filmService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void insertFilm(@RequestBody Film film){
        filmService.insertFilm(film);
    }
}
