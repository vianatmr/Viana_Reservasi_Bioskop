package org.binar.msib.CinemaApp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class DetailOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column
    private Integer order_id;

    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false)
    private Orders orders;

    @Column
    private Integer seat_id;

    @ManyToOne
    @JoinColumn(name = "seat_id", nullable = false, insertable = false, updatable = false)
    private Seat seat;


    @Column
    private Integer film_code;

    @ManyToOne
    @JoinColumn(name = "film_code", nullable = false, insertable = false, updatable = false)
    private Film film;

    @Column
    private Integer schedule_id;

    @ManyToOne
    @JoinColumn(name = "schedule_id", nullable = false, insertable = false, updatable = false)
    private Schedule schedule;

    @Column
    private Integer total_harga;
}
