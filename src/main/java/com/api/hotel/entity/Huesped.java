package com.api.hotel.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Huesped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHuesped;

    private String nombre;
    private String apellidos;
    private String fechaNacimiento;
    private String nacionalidad;
    private String telefono;

    // Creamos la relación 1 a N con la tabla Reserva.
    @OneToMany
    private List<Reserva> reservas = new ArrayList<Reserva>();
}
