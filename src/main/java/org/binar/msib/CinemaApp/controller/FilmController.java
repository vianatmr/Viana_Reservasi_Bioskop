package org.binar.msib.CinemaApp.controller;

import org.binar.msib.CinemaApp.dto.FilmDTO;
import org.binar.msib.CinemaApp.entity.Film;
import org.binar.msib.CinemaApp.entity.Schedule;
import org.binar.msib.CinemaApp.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/film")
public class FilmController {
    @Autowired
    FilmService filmService;
   @PostMapping("/create")
    public FilmDTO insertFilm(@RequestBody FilmDTO request){
       Film film = filmService.mapToEntity(request);
       Film result = filmService.insertFilm(film);
       return filmService.mapToDto(result);
   }
   @PutMapping("/update/{film_code}")
    public FilmDTO updateFilm(@PathVariable Integer film_code, @RequestBody FilmDTO request){
       final Film film = filmService.mapToEntity(request);
       Film result = filmService.updateFilm(film, film_code);
       return filmService.mapToDto(result);
   }
   @GetMapping("/all")
   public List<FilmDTO> getAllFilm(){
      return filmService.getAllFilm().stream().map(film -> filmService.mapToDto(film))
              .collect(Collectors.toList());
   }
   @DeleteMapping("/delete/{film_code}")
   public Boolean delete(@PathVariable Integer film_code){
       return filmService.delete(film_code);
   }

   @GetMapping("/getschedule/{film_code}")
   public Schedule getSchedule(@PathVariable Integer film_code){
       return filmService.getSchedule(film_code);
   }
}
