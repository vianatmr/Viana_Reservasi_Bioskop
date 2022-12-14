package org.binar.msib.CinemaApp.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer film_code;

    @Column
    private String film_name;
    @Column
    private String film_status;
    @Column
    private Integer price;
    
}
