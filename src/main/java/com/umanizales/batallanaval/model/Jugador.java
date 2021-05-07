package com.umanizales.batallanaval.model;

import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Jugador implements Serializable {
    private String nombre;
    private String correo;
    private String contrasenia;
    private double puntaje;
}