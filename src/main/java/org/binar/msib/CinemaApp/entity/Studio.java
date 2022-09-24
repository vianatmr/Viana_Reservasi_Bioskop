package org.binar.msib.CinemaApp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Studio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studio_id;

    @Column
    private String studio_name;
    private Integer capacity;

}
