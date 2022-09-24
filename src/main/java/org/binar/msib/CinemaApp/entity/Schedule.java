package org.binar.msib.CinemaApp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Getter
@Setter
@Entity
public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer schedule_id;

    @Column
    private Integer film_code;
    @ManyToOne
    @JoinColumn(name = "film_code", nullable = false, insertable = false, updatable = false)
    private Film film;

    @Column
    private Date tanggal_tayang;
    private Time jam_mulai;
    private Time jam_selesai;
}
