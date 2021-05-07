package com.umanizales.batallanaval.model;

import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Administrador implements Serializable {
    private String usuario;
    private String correo;
    private String contrasenia;
}