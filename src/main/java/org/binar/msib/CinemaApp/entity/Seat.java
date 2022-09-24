package org.binar.msib.CinemaApp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Seat {

    @Id
    private Integer SeatId;

    @Column
    private Integer studio_id;
    @ManyToOne
    @JoinColumn(name = "studio_id", nullable = false, insertable = false, updatable = false)
    private Studio studio;

    @Column
    private boolean seat_status;

}
