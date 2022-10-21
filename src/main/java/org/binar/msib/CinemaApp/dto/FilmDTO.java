package org.binar.msib.CinemaApp.dto;

import java.util.Objects;

public final class FilmDTO {
    private final Integer film_code;
    private final String film_name;
    private final String film_status;
    private final Integer price;

    FilmDTO(Integer film_code, String film_name, String film_status, Integer price) {
        this.film_code = film_code;
        this.film_name = film_name;
        this.film_status = film_status;
        this.price = price;
    }

    public Integer film_code() {
        return film_code;
    }

    public String film_name() {
        return film_name;
    }

    public String film_status() {
        return film_status;
    }

    public Integer price() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        FilmDTO that = (FilmDTO) obj;
        return Objects.equals(this.film_code, that.film_code) &&
                Objects.equals(this.film_name, that.film_name) &&
                Objects.equals(this.film_status, that.film_status) &&
                Objects.equals(this.price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(film_code, film_name, film_status, price);
    }

    @Override
    public String toString() {
        return "FilmDTO[" +
                "film_code=" + film_code + ", " +
                "film_name=" + film_name + ", " +
                "film_status=" + film_status + ", " +
                "price=" + price + ']';
    }

}
